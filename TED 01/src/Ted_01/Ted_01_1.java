// TED 01
//Fa�a um algoritmo que pergunte quanto voc� ganha por hora,
//o n�mero de horas trabalhadas no m�s.
//Calcule e mostre o total do seu sal�rio no seu referido m�s.
//O sal�rio bruto.
//O quanto pagou ao IPRF
//O quanto pagou ao INSS.
//O quanto pagou ao sindicato.
//O sal�rio l�quido.
//O valor descontado.

package Ted_01;

import javax.swing.JOptionPane;

public class Ted_01_1 {
	
	public static void main(String[] args) {
         
        double valorHora;
        double horasTrabalhadas;
        double valorMes;
         
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que voc� ganha a hora"));
        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas no m�s"));
 
        valorMes = (valorHora * horasTrabalhadas);
        double iprf = ((valorMes * 11)/100);
        double inss = ((valorMes * 8)/100);
        double sindicato = ((valorMes * 5)/100);
        double liquido = ((valorMes * 76)/100);
        double descontos = ((valorMes * 24)/100);        
        
        JOptionPane.showMessageDialog(null,"O valor do sal�rio no m�s � de: " + valorMes + "\nO valor do iprf no m�s � de: " + iprf + "\nO valor do inss no m�s � de: " + inss + "\nO valor do sindicato no m�s � de: " + sindicato + "\nO valor do liquido no m�s � de: " + liquido + "\nO valor do descontos no m�s � de: " + descontos);
     }

}
