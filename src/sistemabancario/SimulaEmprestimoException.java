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
public class SimulaEmprestimoException extends IllegalArgumentException {
    public SimulaEmprestimoException(){
		super("Erro na simulação do empréstimo");
	}
}
