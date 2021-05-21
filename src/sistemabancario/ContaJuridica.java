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
public class ContaJuridica implements Conta{

    private double saldo = 0.0;

    public void extrato() {
        System.out.println("Saldo da conta fisica é: " + saldo);
    }

    public void deposito(double valor) {
        saldo = saldo + valor;
        //saldo += valor;
        System.out.println("Valor depositado: " + valor);
    }

    public void saque(double valor) {
        
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Valor sacado: "+valor);
        }else
            System.out.println("Saldo insuficiente");
    }
    
    
}
