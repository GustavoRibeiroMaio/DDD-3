package ex10formas;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Quadrado> listaQuadrado = new ArrayList<>();
		ArrayList<Retangulo> listaRetangulo = new ArrayList<>();
		ArrayList<Circulo> listaCirculo = new ArrayList<>();

		System.out.println("Digite a quantidade de formas que deseja criar: ");
		int qtdFormas = ler.nextInt();

			for (int i = 1; i <= qtdFormas; i++) {
				System.out.println("Digite o número correspondente a forma que deseja criar\n" + "1- Quadrado\n"
						+ "2- Retângulo\n" + "3- Círculo\n");
				int opcaoForma = ler.nextInt();
	
				if (opcaoForma == 1) {
					System.out.println("Digite o valor do lado do quadrado: ");
					double lado = ler.nextDouble();
	
					Quadrado quadrado = new Quadrado(lado, lado, lado, lado);
					quadrado.calculoPerimetro();
					quadrado.calculoArea();
	
					listaQuadrado.add(quadrado);
	
				} else if (opcaoForma == 2) {
					System.out.println("Digite o valor da altura do retângulo: ");
					double lado = ler.nextDouble();
					System.out.println("Digite o valor da base do retângulo: ");
					double base = ler.nextDouble();
	
					Retangulo retangulo = new Retangulo(lado, base, lado, base);
					retangulo.calculoPerimetro();
					retangulo.calculoArea();
	
					listaRetangulo.add(retangulo);
	
				} else if (opcaoForma == 3) {
					System.out.println("Digite o valor do raio do círculo: ");
					double raio = ler.nextDouble();
	
					Circulo circulo = new Circulo(raio);
					circulo.calculoPerimetro();
					circulo.calculoArea();
	
					listaCirculo.add(circulo);
				}
	
	            try{
	                System.out.println("Digite a quantidade de formas que deseja criar: ");
			        int qtdFormas1 = ler.nextInt();
	
	                System.out.println("Digite o número correspondente a forma que deseja criar\n" + "1- Quadrado\n"
					+ "2- Retângulo\n" + "3- Círculo\n");
				    int opcaoForma1 = ler.nextInt();
	
	            } catch (Exception e) {
							System.out.printf("Revise suas informações e tente novamente", e);
	
			    }
	
			for (Quadrado q : listaQuadrado) {
				System.out.printf("---Quadrado---\n" + "Dados fornecidos: lado = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
						q.getLado(), q.calculoPerimetro(), q.calculoArea());
			}
			for (Retangulo r : listaRetangulo) {
				System.out.printf("\n---Retângulo---\n" + "Dados fornecidos: lado = %.2f - base = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
						r.getLado(),r.getBase(), r.calculoPerimetro(), r.calculoArea());
			}
			for (Circulo c : listaCirculo) {
				System.out.printf("\n---Círculo---\n" + "Dados fornecidos: raio = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
						c.getRaio(), c.calculoPerimetro(), c.calculoArea());
			}
			ler.close();
		}
	}
}
