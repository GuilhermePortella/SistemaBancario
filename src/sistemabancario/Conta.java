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
public interface Conta extends Serializable{
    
    public void extrato();
    
    public void deposito(double valor);
    
    public void saque(double valor);
    
    //CF = CAPITAL FINANCIADO, N = MESES
    public double simulaEmprestimo(double cf, int n);
}
