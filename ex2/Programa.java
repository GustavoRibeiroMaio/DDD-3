package ex2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		ArrayList<PessoaFisica> listaPessoaFisica = new ArrayList<>();
		ArrayList<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
		
        int id;
		String nome;
		String endereco;
		int telefone;
		String cpf;
		int cnpj;
		int opcao;
		
		do {
			System.out.printf("==> Sistema de Cadastro de Pessoas <== \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Incluir Pessoa Fisica \n"+
							  "2 - Incluir Pessoa Juridica \n"+
					 		  "3 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				PessoaFisica PF = new PessoaFisica();
	               
                id = listaPessoa.size() + 1;
                PF.setId(id);
               
                System.out.printf("\nDigite o Nome: ");
                nome = ler.next();
                PF.setNome(nome);
               
                System.out.printf("Digite o Endereço: ");
                endereco = ler.next();
                PF.setEndereco(endereco);
                
                System.out.printf("Digite o Telefone: ");
                telefone = ler.nextInt();
                PF.setTelefone(telefone);
                
                System.out.printf("Digite o CPF: ");
                cpf = ler.next();
                PF.setCpf(cpf);
      
                listaPessoaFisica.add(PF);
               
                System.out.printf("Pessoa Fisica adicionada com sucesso!");
                System.in.read();
				
			}
			
			else if (opcao == 2) {
				PessoaJuridica PJ = new PessoaJuridica();
	               
                id = listaPessoa.size() + 1;
                PJ.setId(id);
               
                System.out.printf("\nDigite o Nome: ");
                nome = ler.next();
                PJ.setNome(nome);
               
                System.out.printf("Digite o Endereço: ");
                endereco = ler.next();
                PJ.setEndereco(endereco);
                
                System.out.printf("Digite o Telefone: ");
                telefone = ler.nextInt();
                PJ.setTelefone(telefone);
                
                System.out.printf("Digite o CNPJ: ");
                cnpj = ler.nextInt();
                PJ.setCnpj(cnpj);
      
                listaPessoaJuridica.add(PJ);
               
                System.out.printf("Pessoa adicionada com sucesso!");
                System.in.read();
				
			}		
		}
		while (opcao != 3);

		ler.close();

	}

}
