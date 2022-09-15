package ex1;

public class ContaSalario extends Conta {
	private double saldoDia;

	public double getSaldoDia() {
		return saldoDia;
	}

	public void setSaldoDia(double saldoDia) {
		this.saldoDia = saldoDia;
	}
	
    public ContaSalario() {
    }
   
    public ContaSalario(String agencia, String numero, double saldo, double saldoDia, int id) {
        super(agencia, numero, saldo, id);
       
        this.saldoDia = saldoDia;
    }
}
