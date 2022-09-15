package ex7;
import java.util.Scanner;

public  abstract class Conta implements IConta {
	Scanner ler = new Scanner(System.in);

    private String agencia;
    private String numero;
    private double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String mostrarSaldo() {
    	return "Seu saldo � de: " + saldo;
    }
    
    public String sacar(double valor) {
    	if (saldo != 0) {
    		System.out.printf("Digite o quanto gostaria de sacar neste momento => \n");
    		valor = ler.nextDouble();
    		
    		String resposta;
    		
    		if (valor < saldo) {
    			
    			this.saldo = saldo - valor;
    			return "Transa��o aprovada, seu saldo atual � de: " + saldo;
    		
    			
    		} else {
    			return "Voc� n�o possui saldo suficiente.";
    		}
    	}
    	
		return "Transa��o finalizada";
    }
}
