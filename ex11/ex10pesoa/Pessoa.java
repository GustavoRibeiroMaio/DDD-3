package ex10pesoa;
import java.util.Scanner;
import ex8.IPessoa;
public abstract class Pessoa implements IPessoa {
Scanner ler = new Scanner(System.in);
	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Pessoa() {
		
	}
	
	public void editarNome(String nome) {
		System.out.print("Digite o nome que deseja => ");
		nome = ler.next();
		
		if (name.length() > 1) {
			System.out.print("Nome alterado com sucesso");
		} else {
			System.out.print("Não foi possível alterar o nome. Necessário ter mais de 1 caracter.");
		}
	}
}
