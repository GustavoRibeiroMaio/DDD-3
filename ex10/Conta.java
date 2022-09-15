package ex10;
import java.util.Scanner;
import Ex07.IConta;
public abstract class Conta implements IConta {
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
    
    // metodos interface
    
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
    			return "Transação aprovada, seu saldo atual é de: " + saldo;
    		
    			
    		} else {
    			return "Você não possui saldo suficiente.";
    		}
    	}
    	
		return "Transação finalizada";
    }
}
