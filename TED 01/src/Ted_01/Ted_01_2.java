


package Ted_01;

import javax.swing.JOptionPane;

public class Ted_01_2 {

    public static void main(String args[])
    {

        double delta;
        double x1;
        double x2;
        double valorA;
        double valorB;
        double valorC;
        
        valorA = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));
        valorB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));
        valorC = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de C: "));

        if(valorA != 0){

            delta = valorB * valorB * 4 * valorA * valorC;

        if(delta >= 0)
        {
            x1 = (double) (( - valorB + (Math.sqrt (delta))) / ( 2 * valorA ));
            x2 = (double) (( - valorB - (Math.sqrt (delta))) / ( 2 * valorA ));
            JOptionPane.showMessageDialog(null, String.format("O valor de x1 � : %.2f    ",x1) + String.format("\nO valor de x2 � : %.2f    ",x2));
        }
        else
        {
            JOptionPane.showMessageDialog(null, String.format("Inconclusivo pois %.2f"+ delta +" � menor que 0   "));
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Est� n�o � uma equa��o de 2� grau, pois o valor de A � = 0   ");
        }
    }
}