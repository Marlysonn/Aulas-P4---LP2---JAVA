package modelo;

public class Retangulo {
	
	//Atributos
	private double retLargura;
	private double retAltura;
	
	public Retangulo(double retLargura, double retAltura) {
		this.retLargura = retLargura;
		this.retAltura = retAltura;
	}
	
	public double multiplicaLados() {
		return retLargura * retAltura;
	}

	public double getRetLargura() {
		return retLargura;
	}

	public void setRetLargura(double retLargura) {
		this.retLargura = retLargura;
	}

	public double getRetAltura() {
		return retAltura;
	}

	public void setRetAltura(double retAltura) {
		this.retAltura = retAltura;
	}
	
	
	
}
