package ex8;

public class PessoaFisica extends Pessoa implements IPessoa {
	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica() {
		
	}
	public String verNome() {
		return null;
	}

	}

