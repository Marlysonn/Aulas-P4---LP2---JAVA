package Modelo;

public class Retangulo {
	
	//Atributos
	private double retLargura;
	private double retAltura;
	
	//Construtor
	public Retangulo() {}
	
	
	public double multiplicaLados() {
		return retLargura * retAltura;
	}

	public double getRetLargura() {
		return retLargura;
	}
	
	public double getRetAltura() {
		return retAltura;
	}

	public void setRetLargura(double retLargura) {
		this.retLargura = retLargura;
	}

	public void setRetAltura(double retAltura) {
		this.retAltura = retAltura;
	}
	
}
