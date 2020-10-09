package modelo;

//import modelo.Retangulo;

public class Moldura {
	
	private Retangulo ret;
	private double espEspessura;
	
	public Moldura(Retangulo ret, double espEspessura) {
		this.ret = ret;
		this.espEspessura = espEspessura;
	}
	
	public double multiplicaLados() {
		double areaRetangulo = ret.getRetLargura() * ret.getRetAltura();
		return areaRetangulo;
	}
	
	public double molduraInterna() {
		double mold = (ret.getRetLargura() - 2 * espEspessura) * (ret.getRetAltura() - 2 * espEspessura);
		return mold;
	}

	public Retangulo getRet() {
		return ret;
	}

	public void setRet(Retangulo ret) {
		this.ret = ret;
	}

	public double getEspEspessura() {
		return espEspessura;
	}

	public void setEspEspessura(double espEspessura) {
		this.espEspessura = espEspessura;
	}

	public String toString() {
		return "" + (multiplicaLados() - molduraInterna()) ;
	}
}