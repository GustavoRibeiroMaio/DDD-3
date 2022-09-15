package ex7;

public class ContaPoupanca extends Conta implements IConta{
	 private double rentabilidade;

	    public double getRentabilidade() {
	        return rentabilidade;
	    }

	    public void setRentabilidade(double rentabilidade) {
	        this.rentabilidade = rentabilidade;
	    }

	    public ContaPoupanca(double rentabilidade) {
	        this.rentabilidade = rentabilidade;
	    }

	    public ContaPoupanca() {
	    }
	    public void depositar(double valor) {
}

}