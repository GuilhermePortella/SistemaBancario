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
public class CorrentistaFisico extends Correntista{
    
    public CorrentistaFisico(String nome) {
        super(nome);
    }
    
    public void exibiIdentificacao(){
        System.out.println("Eu sou correntista fisico: " + getCodigo() + " - " + getNome());
    }
    
}
