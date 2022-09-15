package Ex5;

public class ContaPoupanca extends Conta{
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
}
