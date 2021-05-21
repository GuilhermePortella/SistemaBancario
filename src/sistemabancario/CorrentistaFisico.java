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
class CorrentistaFisico extends Correntista{
    
    public CorrentistaFisico(String nome, ContaFisica conta) {
        super(nome, conta);
    }

    @Override
    public void exibeIdentificacao() {
        System.out.println("Eu sou correntista fisico: " + getCodigo() + " - " + getNome());
    }
    
}
