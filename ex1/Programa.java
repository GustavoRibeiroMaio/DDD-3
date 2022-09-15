package ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
        ArrayList<Conta> listaConta = new ArrayList<>();
		ArrayList<ContaCorrente> listaContaCorrente = new ArrayList<>();
		ArrayList<ContaPoupanca> listaContaPoupanca = new ArrayList<>();
		ArrayList<ContaSalario> listaContaSalario = new ArrayList<>();
		
        int id;
		int opcao;
		String agencia;
		String numero;
		double saldo;
		
		
		do {
			System.out.printf("==> Sistema de Cadastro de Contas <== \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Incluir Conta Corrente \n"+
							  "2 - Incluir Conta Poupança \n"+
					 		  "3 - Incluir Conta Salário \n"+
					 		  "4 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				ContaCorrente CC = new ContaCorrente();
	               
                id = listaConta.size() + 1;
                CC.setId(id);
               
                System.out.printf("\nDigite a Agencia: ");
                agencia = ler.next();
                CC.setAgencia(agencia);
               
                System.out.printf("Digite o numero da Conta Corrente: ");
                numero = ler.next();
                CC.setNumero(numero);
                
                System.out.printf("Digite o Saldo: ");
                saldo = ler.nextInt();
                CC.setSaldo(saldo);
      
                listaContaCorrente.add(CC);
               
                System.out.printf("Conta criada com sucesso!");
                System.in.read();
				
			}
			
			else if (opcao == 2) {
				ContaPoupanca CP = new ContaPoupanca();
	               
                id = listaConta.size() + 1;
                CP.setId(id);
               
                System.out.printf("\nDigite a Agencia: ");
                agencia = ler.next();
                CP.setAgencia(agencia);
               
                System.out.printf("Digite o numero da Conta Poupança: ");
                numero = ler.next();
                CP.setNumero(numero);
                
                System.out.printf("Digite o Saldo: ");
                saldo = ler.nextInt();
                CP.setSaldo(saldo);
      
                listaContaPoupanca.add(CP);
               
                System.out.printf("Conta criada com sucesso!");
                System.in.read();
				
			}
			else if (opcao == 3) {
				ContaSalario CS = new ContaSalario();
	               
                id = listaConta.size() + 1;
                CS.setId(id);
               
                System.out.printf("\nDigite a Agencia: ");
                agencia = ler.next();
                CS.setAgencia(agencia);
               
                System.out.printf("Digite o numero da Conta Poupança: ");
                numero = ler.next();
                CS.setNumero(numero);
                
                System.out.printf("Digite o Saldo: ");
                saldo = ler.nextInt();
                CS.setSaldo(saldo);
      
                listaContaSalario.add(CS);
               
                System.out.printf("Conta criada com sucesso!");
                System.in.read();
				
			}			
		}
		while (opcao != 4);

		ler.close();

	}
}
