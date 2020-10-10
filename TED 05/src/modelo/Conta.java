package modelo;

public class Conta {
	
	private double saldo;
	private Integer numero;
	
	public Conta() {}
	
	public Conta(double saldo, Integer numero) {
		this.saldo = saldo;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", getSaldo()=" + getSaldo() + ", getNumero()="
				+ getNumero() + "]";
	}
}
