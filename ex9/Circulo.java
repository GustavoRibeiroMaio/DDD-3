package ex9;

public class Circulo {
private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculoArea() {
		double resultado = Math.PI *(raio * 2);
		return resultado;
	}
	
	public double calculoPerimetro() {
		double resultado = (2 * Math.PI) * raio ;
		return resultado;
	}
}
