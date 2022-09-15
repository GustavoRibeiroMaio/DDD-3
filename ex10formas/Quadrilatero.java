package ex10formas;
import ex9.FormasGeometricas;
public abstract class Quadrilatero  implements FormasGeometricas {
	protected double base;
	protected double lado;
	protected double ladoOposto;
	protected double superior;
	
	
	public double calculoPerimetro(double base, double lado) {
		double resultado = base * lado;
		return resultado;
	}

	public Quadrilatero(double base, double lado, double ladoOposto, double superior) {
		super();
		this.base = base;
		this.lado = lado;
		this.ladoOposto = ladoOposto;
		this.superior = superior;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLadoOposto() {
		return ladoOposto;
	}

	public void setLadoOposto(double ladoOposto) {
		this.ladoOposto = ladoOposto;
	}

	public double getSuperior() {
		return superior;
	}

	public void setSuperior(double superior) {
		this.superior = superior;
	}

}
