/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Banco {

    public static void main(String[] args) {
        
        ArrayList<Correntista> listaDeClientes = new ArrayList<Correntista>();
        

        CorrentistaFisico objCorrentista1 = new CorrentistaFisico("João");
        listaDeClientes.add(objCorrentista1);
        
        CorrentistaFisico objCorrentista2 = new CorrentistaFisico("Luiz");
        listaDeClientes.add(objCorrentista2);
        
        CorrentistaFisico objCorrentista3 = new CorrentistaFisico("Kelly");
        listaDeClientes.add(objCorrentista3);
        
        CorrentistaFisico objCorrentista4 = new CorrentistaFisico("Ana");
        listaDeClientes.add(objCorrentista4);
        
        CorrentistaJuridico objCorrentista5 = new CorrentistaJuridico("Lenovo", "Carlos");
        listaDeClientes.add(objCorrentista5);
        
        
        objCorrentista1.exibeIdentificacao();
        objCorrentista2.exibeIdentificacao();
        objCorrentista3.exibeIdentificacao();
        objCorrentista4.exibeIdentificacao();
        objCorrentista5.exibeIdentificacao();
    }
}
