package visao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Conta;

public class Saldo {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> numcontas = new ArrayList<>();
		double saldoSuperior = 0;
		double clienteSaldoSuperior = 0;		
		
		double valorConta1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta 1:  "));
		int numConta1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta 1:   "));
		
		double valorConta2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta 2:  "));
		int numConta2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta 2:   "));
		
		double valorConta3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta 3:  "));
		int numConta3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta 3:   "));
		
		Conta cliente1 = new Conta(valorConta1,numConta1);
		Conta cliente2 = new Conta(valorConta2,numConta2);
		Conta cliente3 = new Conta(valorConta3,numConta3);		
		
		numcontas.add(cliente1);
		numcontas.add(cliente2);
		numcontas.add(cliente3);		
				
		for(Conta conta : numcontas) {
			if(conta.getSaldo() > saldoSuperior) {
				saldoSuperior = conta.getSaldo();
				clienteSaldoSuperior = conta.getNumero();
			}
		}
		JOptionPane.showMessageDialog(null, String.format("A conta com maior saldo é: %.0f ", clienteSaldoSuperior) + String.format("\nO valor de saldo é: %.2f", saldoSuperior));	
	}
}
