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

    public Correntista() {
        this.codigo = Correntista.getProxCodigo();
        this.nome = "";

    }

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

    public static int getProxCodigo() {
        return Correntista.proxCodigo++;
    }
    
    public void exibeIdentificacao(){
        System.out.println("Eu sou correntista: " + getCodigo() + " - " + getNome());
    }
}
