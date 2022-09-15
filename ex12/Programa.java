package ex12;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Programa {

    public static void main(String args[]) {

        String arquivo = "./lista.txt";
        Scanner ler = new Scanner(System.in);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        String[] carrinho = new String[6];

        int opcao = 0;

        do {

            try {

                System.out.printf("Sistema de Cadastro de Compras \n\n" +
                        "1 - Cadastrar produtos\n" +
                        "2 - Ver lista de compras\n" +
                        "3 - Sair \n\n" +
                        "Digite 1 ou 2 para começar => ");
                opcao = ler.nextInt();

                if (opcao == 1) {

                    for (int i = 0; i < 6; i++) {

                        System.out.printf(
                                "Digite o nome do item, quantidade e preço para adicionar ao carrinho ( %s /  ) => ",
                                i);
                        carrinho[i] = ler.next();

                    }

                    System.out.printf("Lista salva com sucesso.");
                    opcao = 2;

                }

            } catch (Exception e) {

                System.out.println("Erro ao ler o arquivo - " + e.getMessage());

            }
            if (opcao == 2) {

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {

                    bw.write("+---LISTA DE COMPRAS---+");

                    for (String itemLinha : carrinho) {

                        System.out.printf(itemLinha + ",");
                        bw.write(itemLinha);
                        bw.newLine();
                    }

                    bw.write("+----------------------+");

                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo - " + e.getMessage());
                    e.printStackTrace();
                }

                try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

                    String line = br.readLine();

                    while (line != null) {

                        System.out.println(line);
                        line = br.readLine();

                    }
                } catch (FileNotFoundException e) {

                    System.out.printf("Erro", e.getMessage());
                    e.printStackTrace();

                } catch (IOException e) {

                    e.printStackTrace();
                }

            }

        } while (opcao != 3);

    }
}
