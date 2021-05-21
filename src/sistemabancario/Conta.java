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
public interface Conta {
    
    public void extrato();
    
    public void deposito(double valor);
    
    public void saque(double valor);
}
