// TED 01
//Faça um algoritmo que pergunte quanto você ganha por hora,
//o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no seu referido mês.
//O salário bruto.
//O quanto pagou ao IPRF
//O quanto pagou ao INSS.
//O quanto pagou ao sindicato.
//O salário líquido.
//O valor descontado.

package Ted_01;

import javax.swing.JOptionPane;

public class Ted_01_1 {
	
	public static void main(String[] args) {
         
        double valorHora;
        double horasTrabalhadas;
        double valorMes;
         
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que você ganha a hora"));
        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas no mês"));
 
        valorMes = (valorHora * horasTrabalhadas);
        double iprf = ((valorMes * 11)/100);
        double inss = ((valorMes * 8)/100);
        double sindicato = ((valorMes * 5)/100);
        double liquido = ((valorMes * 76)/100);
        double descontos = ((valorMes * 24)/100);        
        
        JOptionPane.showMessageDialog(null,"O valor do salário no mês é de: " + valorMes + "\nO valor do iprf no mês é de: " + iprf + "\nO valor do inss no mês é de: " + inss + "\nO valor do sindicato no mês é de: " + sindicato + "\nO valor do liquido no mês é de: " + liquido + "\nO valor do descontos no mês é de: " + descontos);
     }

}
