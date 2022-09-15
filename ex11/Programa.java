package ex11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Programa {
	 public static void main(String[] args) throws IOException {

	        Scanner ler = new Scanner(System.in);

	        ArrayList<FrontEnd> listaFrontEnd = new ArrayList<>();
	        ArrayList<BackEnd> listaBackEnd = new ArrayList<>();

	        int option;
	        int confirmar;
	        String resposta;

	        int id;
	        String nomeLinguagem;
	        String nomeFramework;
	        String descricao;

	        FrontEnd front;
	        boolean web;
	        boolean mobile;

	        BackEnd back;
	        boolean conteinerizacao;

	        do {

	            System.out.printf("SISTEMA DE CADASTRO DE TECNOLOGIAS \n" +
	                    "Escolha qual tipo de tecnologia você deseja criar:\n\n" +
	                    "1) Front End\n" +
	                    "2) Back End\n" +
	                    "3) Listar Tecnologias\n" +
	                    "4) Sair\n\n");

	            System.out.printf("Digite a opção desejada => ");
	            option = ler.nextInt();

	            if (option == 1) {

	                try {

	                    front = new FrontEnd();

	                    id = listaFrontEnd.size() + 1;
	                    front.setId(id);

	                    System.out.printf("Digite o nome da linguagem de programacao => ");
	                    nomeLinguagem = ler.next();
	                    front.setNomeLinguagem(nomeLinguagem);

	                    System.out.printf("Digite o nome do Framework => ");
	                    nomeFramework = ler.next();
	                    front.setNomeFramework(nomeFramework);

	                    System.out.printf("Digite a descrição da linguagem e framework => ");
	                    descricao = ler.next();
	                    front.setDescricaoLinguagem(descricao);

	                    System.out.printf("Possui portabilidade para Web? S - sim N - nao => ");
	                    resposta = ler.next();

	                    if (resposta == "N" || resposta == "n") {
	                        front.setCompatibilidadeWeb(false);
	                    } else {
	                        front.setCompatibilidadeWeb(true);
	                    }

	                    System.out.printf("Possui portabilidade para Mobile? S - sim N - nao => ");
	                    resposta = ler.next();

	                    if (resposta == "N" || resposta == "n") {
	                        front.setCompatibilidadeWeb(false);
	                    } else {
	                        front.setCompatibilidadeWeb(true);
	                    }

	                    System.out.printf("As informações estão corretas?\n\n" +
	                            "0 - REFAZER\n" +
	                            "1 - CONFIRMAR\n\n");
	                    System.out.printf("Responda => ");

	                    confirmar = ler.nextInt();

	                    if (confirmar == 1) {
	                        listaFrontEnd.add(front);
	                    }

	                    System.in.read();

	                    if (listaFrontEnd.size() >= 1) {

	                        for (int i = 0; i < listaFrontEnd.size(); i++) {
	                            System.out.printf("Tecnologias encontradas: \n\n" + "Nome - %s ", front.getNomeFramework());
	                        }

	                    }

	                } catch (Exception e) {
	                    System.out.printf("Revise as informacoes digitadas");
	                }

	                System.out.printf("Cadastrado com sucesso! Digite 4 para sair");

	            } else if (option == 2) {

	                try {

	                    back = new BackEnd();

	                    id = listaFrontEnd.size() + 1;
	                    back.setId(id);

	                    System.out.printf("Digite o nome da linguagem de programacao => ");
	                    nomeLinguagem = ler.next();
	                    back.setNomeLinguagem(nomeLinguagem);

	                    System.out.printf("Digite o nome do Framework => ");
	                    nomeFramework = ler.next();
	                    back.setNomeFramework(nomeFramework);

	                    System.out.printf("Digite a descrição da linguagem e framework => ");
	                    descricao = ler.next();
	                    back.setDescricaoLinguagem(descricao);

	                    System.out.printf("As informações estão corretas?\n\n" +
	                            "0 - REFAZER\n" +
	                            "1 - CONFIRMAR\n\n");
	                    System.out.printf("Responda => ");

	                    confirmar = ler.nextInt();

	                    if (confirmar == 1) {
	                        listaBackEnd.add(back);
	                    }

	                    System.in.read();

	                    if (listaFrontEnd.size() >= 1) {

	                        for (int i = 0; i < listaFrontEnd.size(); i++) {
	                            System.out.printf("Tecnologias encontradas: \n\n" + "Nome - %s ", back.getNomeFramework());
	                        }

	                    }

	                } catch (Exception e) {
	                    System.out.printf("Revise as informacoes digitadas", e.getMessage());
	                }

	                System.out.printf("Cadastrado com sucesso! Digite 4 para sair. ");

	            } else if (option == 3) {

	                System.out.printf("Escolha qual você deseja ver a listagem \n\n" +
	                        "1 - FRONT END\n" +
	                        "2 - BACK END");
	                confirmar = ler.nextInt();

	                if (confirmar == 1) {

	                    try {

	                        if (listaFrontEnd.size() >= 1) {

	                            for (FrontEnd f : listaFrontEnd) {
	                                System.out.printf(
	                                        "\nLIVROS DISPONIVEIS\n Id: %d - Nome da framework: %s \n - Nome da Linguagem: %s",
	                                        f.getId(), f.getNomeFramework(), f.getNomeLinguagem());
	                            }

	                        }

	                    } catch (Exception e) {
	                        System.out.printf("Não ha quantidade suficiente de informacoes", e);
	                    }

	                } else {

	                    try {

	                        if (listaFrontEnd.size() >= 1) {

	                            for (BackEnd b : listaBackEnd) {
	                                System.out.printf(
	                                        "\nLIVROS DISPONIVEIS\n Id: %d - Nome da framework: %s \n - Nome da Linguagem: %s",
	                                        b.getId(), b.getNomeFramework(), b.getNomeLinguagem());
	                            }

	                        }

	                    } catch (Exception e) {
	                        System.out.printf("Não ha quantidade suficiente de informacoes", e);
	                    }
	                }

	            }

	        } while (option != 4);

	        ler.close();
	    }

}
