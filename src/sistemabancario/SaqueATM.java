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
public class SaqueATM extends Thread {

    private Conta conta;
    private double saque;

    public SaqueATM(Conta conta, double saque) {
        this.conta = conta;
        this.saque = saque;
    }

    public void run() {
        conta.saque(saque);
        conta.extrato();
    }
}
