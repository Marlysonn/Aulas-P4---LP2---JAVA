package Visao;

import Modelo.Retangulo;
import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		
		Retangulo multiAL = new Retangulo();
			
		multiAL.setRetLargura((Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Largura do Retangulo:   "))));
		multiAL.setRetAltura((Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Altura do Retangulo:   "))));
	
		JOptionPane.showMessageDialog(null, String.format("O valor da Largura: %.2f metros " , multiAL.getRetLargura() ) + String.format( "\nO valor da Altura: %.2f metros " , multiAL.getRetAltura() ) + String.format( "\nO valor da Area desse Retangulo é de: %.2f metros quadrados " , multiAL.multiplicaLados()));
	}
}
