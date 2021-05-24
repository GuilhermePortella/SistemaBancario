/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

import java.io.Serializable;

/**
 *
 * @author Guilherme
 */
abstract class Correntista implements Serializable{

    private int codigo;
    private String nome;

    private static int proxCodigo = 1;
    
    private Conta conta;

    public Correntista() {
        this.codigo = Correntista.getProxCodigo();
        this.nome = "";

    }

    public Correntista(String nome, Conta conta) {
        this.codigo = getProxCodigo();
        
        this.nome = nome;
        
        this.conta = conta;
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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }    
    public abstract void exibeIdentificacao();
}
