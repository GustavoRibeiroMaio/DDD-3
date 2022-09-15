package ex1;

public class Conta {
	private int id;
	private String agencia;
	private String numero;
    private double saldo;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
     
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

	protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Alan o Brabo!";
    }  
   
    Conta(){
       
    }
   
    Conta(String agencia, String numero, double saldo, int id){
    	this.id = id;
    	this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

}

