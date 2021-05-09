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
public class Correntista {

    private int codigo;
    private String nome;

    private static int proxCodigo = 1;

    public Correntista(String nome) {
        this.codigo = getProxCodigo();
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static int getProxCodigo(){
        return proxCodigo ++;
    }
    
    public static void imprimirSaudacao(){
    
        System.out.println("Ola mundo");
    }

}
