package ex2;

public class Pessoa {
	private int id;
	private String nome;
	private String endereco;
	private int telefone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	protected String exibirMensagem() {
        return "Bem vindo ao Cadastro de Pessoas do Alan o Brabo!";
    }  
	
	Pessoa() {
		
	}
	
	Pessoa(int id, String nome, String endereco, int telefone) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

}
