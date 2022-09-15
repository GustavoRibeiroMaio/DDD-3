package ex1;

public class ContaCorrente extends Conta {
	private double chequeEspecial;
	 
    public double getChequeEspecial() {
        return chequeEspecial;
    }
 
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   
    public ContaCorrente() {
    }
   
    public ContaCorrente(String agencia, String numero, double saldo, double chequeEspecial, int id) {
        super(agencia, numero, saldo, id);
       
        this.chequeEspecial = chequeEspecial;
    }
}
