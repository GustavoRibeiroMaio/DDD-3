package ex10;

import Ex07.Conta;
import Ex07.IConta;

public class ContaSalario extends Conta implements IConta{
	private int cnpjEmpregador;

	public int getCnpjEmpregador() {
		return cnpjEmpregador;
	}

	public void setCnpjEmpregador(int cnpjEmpregador) {
		this.cnpjEmpregador = cnpjEmpregador;
	}
	
	
	public ContaSalario() {
		
	}


	public void depositar(double valor) {

	}
}
