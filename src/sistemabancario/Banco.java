/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

import java.util.ArrayList;
import GraphicInterface.Initial;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import jdk.internal.dynalink.support.BottomGuardingDynamicLinker;
import java.io.ObjectInputStream;
import java.util.Collection;

/**
 *
 * @author Guilherme
 */
public class Banco {

    private ArrayList<Correntista> listaClientes;

    public Banco() {
        this.listaClientes = new ArrayList<Correntista>();
    }

    public void addCliente(Correntista c) {
        listaClientes.add(c);
    }

    public void removeCliente(Correntista c) {
        listaClientes.remove(c);
    }

    public void removeTodosClientes() {
        listaClientes.clear();
    }

    public Collection<Correntista> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Correntista> c) {
        this.listaClientes = new ArrayList<>(c);
    }

    public void salvaClientela() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("clientes.dat"), false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Correntista c : listaClientes) {
            oos.writeObject(c); // Persiste cliente no arquivo clientes.dat
        }

        oos.close();
    }

    public void leClientela() throws IOException, ClassNotFoundException {
        this.removeTodosClientes(); // Zera a lista

        FileInputStream fis = new FileInputStream(new File("clientes.dat"));
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = null;
        try { //Lê objetos um a um
            while ((obj = ois.readObject()) != null) {
                this.addCliente((Correntista) obj); // Typecasting
            }
        } catch (EOFException e) {
        } finally {
            ois.close(); // Fecha o arquivo
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaFisica conta = new ContaFisica();
        conta.deposito(1000.0); // Valor depositado: 1000.0

        CorrentistaFisico cJoao = new CorrentistaFisico("João", conta);
        CorrentistaFisico cMaria = new CorrentistaFisico("Maria", conta);

        banco.addCliente(cJoao);
        banco.addCliente(cMaria);

        SaqueATM s1 = new SaqueATM(cJoao.getConta(), 1000.0);
        SaqueATM s2 = new SaqueATM(cMaria.getConta(), 1000.0);

        s1.start();

        s2.start();
    }

}
