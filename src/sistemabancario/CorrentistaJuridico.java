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
public class CorrentistaJuridico {

    private int codigo;
    private String nome;
    private String nomeResponsavel;

    private static int proxCodigo = 1;

    public CorrentistaJuridico(int codigo, String nome, String nomeResponsavel) {
        this.codigo = getProxCodigo();;
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public static int getProxCodigo() {
        return proxCodigo++;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

}
