package ex10;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Programa {
	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);

		ArrayList<ContaSalario> contaSalarioList = new ArrayList<>();
		ArrayList<ContaPoupanca> contaPoupancaList = new ArrayList<>();
		ArrayList<ContaCorrente> contaCorrenteList = new ArrayList<>();

		int option;

		String agencia;
		String numero;
		double saldo;
		int cnpj;

		double rentabilidade;
		double chequeEspecial;

		int confirmar;

		do {

			System.out.printf("Sistema de Cadastro de Conta \n" +
					"Escolha qual tipo de conta você deseja:\n\n" +
					"1) Conta Poupança\n" +
					"2) Conta Corrente\n" +
					"3) Conta Salário\n" +
					"4) Sair\n\n");
			System.out.printf("Digite a opção desejada => ");

			option = ler.nextInt();

			if (option == 1) {

				do {

					ContaPoupanca cp = new ContaPoupanca();

					try {
						System.out.printf("Digite a agência => ");
						agencia = ler.next();
						cp.setAgencia(agencia);

						System.out.printf("Digite o número => ");
						numero = ler.next();
						cp.setNumero(numero);

						System.out.printf("Digite quanto deseja depositar => ");
						saldo = ler.nextDouble();
						cp.setSaldo(saldo);

						System.out.printf("Digite o limite de cheque especial => ");
						rentabilidade = ler.nextDouble();
						cp.setRentabilidade(rentabilidade);

					} catch (Exception e) {
						System.out.printf("Erro: revise os dados que foram digitados");
					}

					System.out.printf("As informações estão corretas?\n\n" +
							"0 - REFAZER\n" +
							"1 - CONFIRMAR\n\n");
					System.out.printf("Responda => ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						contaPoupancaList.add(cp);
					}

					System.out.printf("Pessoa física cadastrada com sucesso");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 2) {

				do {

					ContaCorrente cc = new ContaCorrente();

					try {
						System.out.printf("Digite a agência => ");
						agencia = ler.next();
						cc.setAgencia(agencia);

						System.out.printf("Digite o número => ");
						numero = ler.next();
						cc.setNumero(numero);

						System.out.printf("Digite quanto deseja depositar => ");
						saldo = ler.nextDouble();
						cc.setSaldo(saldo);

						System.out.printf("Digite o limite de cheque especial => ");
						chequeEspecial = ler.nextDouble();
						cc.setChequeEspecial(chequeEspecial);
					} catch (Exception e) {
						System.out.printf("Revise as informações e tente novamente.", e);
					}

					System.out.printf("As informações estão corretas?\n\n" +
							"0 - REFAZER\n" +
							"1 - CONFIRMAR\n\n");
					System.out.printf("Responda => ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						contaCorrenteList.add(cc);
					}

					System.out.printf("Pessoa física cadastrada com sucesso");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 3) {

				do {

					ContaSalario cs = new ContaSalario();

					try {

						System.out.printf("Digite a agência => ");
						agencia = ler.next();
						cs.setAgencia(agencia);

						System.out.printf("Digite o número => ");
						numero = ler.next();
						cs.setNumero(numero);

						System.out.printf("Digite quanto deseja depositar => ");
						saldo = ler.nextDouble();
						cs.setSaldo(saldo);

						System.out.printf("Digite o CNPJ do empregador => ");
						cnpj = ler.nextInt();
						cs.setCnpjEmpregador(cnpj);

					} catch (Exception e) {
						System.out.printf("Revise as informações e tente novamente", e);
					}

					System.out.printf("As informações estão corretas?\n\n" +
							"0 - REFAZER\n" +
							"1 - CONFIRMAR\n\n");
					System.out.printf("Responda => ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						contaSalarioList.add(cs);
					}

					System.out.printf("Pessoa física cadastrada com sucesso");
					System.in.read();

				} while (confirmar != 1);

			}

		} while (option != 4);

		ler.close();
	}
}
