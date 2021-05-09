/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

/**
 *
 * @author Guilherme
 */
public class Banco {

    public static void main(String[] args) {

        Correntista objCorrentista1 = new Correntista("João");
        Correntista objCorrentista2 = new Correntista("Bruna");
        Correntista objCorrentista3 = new Correntista("Kelly");
        Correntista objCorrentista4 = new Correntista("Ana");
        
        System.out.println(objCorrentista1.getCodigo() + " - " + objCorrentista1.getNome());
        System.out.println(objCorrentista2.getCodigo() + " - " + objCorrentista2.getNome());
        System.out.println(objCorrentista3.getCodigo() + " - " + objCorrentista3.getNome());
        System.out.println(objCorrentista4.getCodigo() + " - " + objCorrentista4.getNome());
    
        
        Correntista.imprimirSaudacao();
    
    }
}
