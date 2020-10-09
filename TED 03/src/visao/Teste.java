package visao;

import modelo.Moldura;
import modelo.Retangulo;
import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		
		double retlargura;
		double retaltura;
		double moldEspessura;
		
		retlargura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Largura do Retangulo:   "));
		retaltura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Altura do Retangulo:   "));
		moldEspessura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Espessura:   "));
		
		Retangulo ret = new Retangulo(retlargura, retaltura);
		Moldura esp = new Moldura(ret, moldEspessura);
						
		JOptionPane.showMessageDialog(null, String.format("O valor da Largura: %.1f centimetros  " , ret.getRetLargura() ) + String.format("\nO valor da Altura: %.1f centimetros  " , ret.getRetAltura() ) + String.format("\nO valor da Espessura: %.0f", esp.getEspEspessura() ));
		JOptionPane.showMessageDialog(null, String.format("A Area da Moldura é de: " + esp + " centimetros quadrados") );
	}
}