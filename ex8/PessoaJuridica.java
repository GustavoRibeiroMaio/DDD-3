package ex8;

public class PessoaJuridica  extends Pessoa implements IPessoa  {
	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public PessoaJuridica() {
		
	}
	public String verNome() {
		return null;
	}

	}

