package ex10pesoa;
import ex8.IPessoa;
import ex8.Pessoa;
public class PessoaFisica extends Pessoa implements {

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
