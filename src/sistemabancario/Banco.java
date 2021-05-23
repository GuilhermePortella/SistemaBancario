/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

import java.util.ArrayList;
import GraphicInterface.Initial;
import jdk.internal.dynalink.support.BottomGuardingDynamicLinker;

/**
 *
 * @author Guilherme
 */
public class Banco {

    public static void main(String[] args) {
        
        ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();
        

        CorrentistaFisico objCorrentista1 = new CorrentistaFisico("João", new ContaFisica());
        listaDeClientes.add(objCorrentista1);
        
        CorrentistaFisico objCorrentista2 = new CorrentistaFisico("Luiz", new ContaFisica());
        listaDeClientes.add(objCorrentista2);
        
        CorrentistaFisico objCorrentista3 = new CorrentistaFisico("Kelly", new ContaFisica());
        listaDeClientes.add(objCorrentista3);
        
        CorrentistaFisico objCorrentista4 = new CorrentistaFisico("Ana", new ContaFisica());
        listaDeClientes.add(objCorrentista4);
        
        CorrentistaJuridico objCorrentista5 = new CorrentistaJuridico("Lenovo", "Carlos", new ContaJuridica());
        listaDeClientes.add(objCorrentista5);
        
        
        objCorrentista1.exibeIdentificacao();
        objCorrentista2.exibeIdentificacao();
        objCorrentista3.exibeIdentificacao();
        objCorrentista4.exibeIdentificacao();
        objCorrentista5.exibeIdentificacao();
        //CorrentistaJuridico.exibeIdentificacao();
        
        try{
            System.out.println(objCorrentista5.getConta().simulaEmprestimo(5000.0, -12));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Argumento invalido");
        }
    }
}
