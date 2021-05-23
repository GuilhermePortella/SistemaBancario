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
public class ContaJuridica implements Conta {

    private double saldo = 0.0;

    //TAXA DE JUROS APLICADA
    public static final double I = 0.05;

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
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double simulaEmprestimo(double cf, int n) throws IllegalArgumentException {
        if (cf <= 0.0 || n <= 0) {
            throw new IllegalArgumentException();
        } else {
            return I / (1 - 1 / Math.pow(1 + I, n)) * cf;
        }
    }

}
