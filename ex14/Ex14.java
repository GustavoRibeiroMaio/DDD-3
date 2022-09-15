package ex14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {
	  public static void main(String args[]) {

	        String arquivo = "teste.txt";

	        FileReader fileReader = null;
	        BufferedReader bufferedReader = null;
	        Scanner ler = new Scanner(System.in);

	        String[] carrinho = null;
	        
	        String item;
	        int opcao;
	        int escolha = 0;
	        

	        try {
	        	
	        	fileReader = new FileReader(arquivo);
	            bufferedReader = new BufferedReader(fileReader);
	            
	            String linha = bufferedReader.readLine();
	       
	            	
	            	do {
	            		
	            		
	            		System.out.printf("SISTEMA DE CADASTRO DE COMPRAS\n\n" +
	    						"1 - Cadastrar produtos\n" +
	    						"2 - Ver lista de compras\n\n" +
	    						"3 - Ver lista de compras e valores\n\n" +
	    						"Digite 1 ou 2 para começar");
	                	opcao = ler.nextInt();
	                	
	                	
	                   	if (opcao == 1) {
	                		
	                			
	                            for (int i = 1; i <= 2; i++) {

	                                System.out.printf("Digite o nome do item, quantidade, e preço para adicionar ao carrinho ( item %s ) => ", i);
	                                item = ler.next();
	                                

	                            }
	                            
	                            System.out.printf("Itens cadastrados com sucesso. Digite 0 para sair");
	                            System.in.read();
	                            
	                           
	                            
	                   } else if (opcao == 2) {
	                	   
	                       try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
	                    	   
	                    	   if (carrinho.length != 0) {
	                    		   
	                               for (String itemLista: carrinho) {
	                            	   
	                                   bw.write(itemLista);
	                                   bw.newLine();
	                               }                    		   
	                    	   }


	                       } catch (IOException e) {
	                           e.printStackTrace();
	                       }
	            		
	            	} while (opcao != 0);
	            	
	            	
	            	
	            } 
	        

	    

	        	
	            while (linha != null) ;
	            {

	                System.out.println(linha);
	                linha = bufferedReader.readLine();
	            }
	            	
	           

	        } catch (Exception e) {

	            System.out.println("Erro ao ler o arquivo - " + e.getMessage());

	        } finally {

	            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {

	                for (String linha : carrinho) {

	                    bw.write(linha);
	                    bw.newLine();
	                }

	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
