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
public class CorrentistaJuridico extends Correntista{

    private String nomeResponsavel;

    public CorrentistaJuridico(String nome) {
        super(nome);
        this.nomeResponsavel = "";
    }

    public CorrentistaJuridico(String nomeResponsavel, String nome) {
        super(nome);
        this.nomeResponsavel = nomeResponsavel;
    }
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void exibeIdentificacao(){
        System.out.println("Eu sou correntista Juridico: " + getCodigo() + " - " + getNome() + " - " + getNomeResponsavel());
    }
}
