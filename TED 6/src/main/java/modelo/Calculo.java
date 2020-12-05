
package modelo;

import java.util.ArrayList;

public class Calculo{
    
    private ArrayList operando = new ArrayList();
    private ArrayList operado = new ArrayList();

    public Calculo() {
    }

    public ArrayList getOperando() {
        return operando;
    }

    public void setOperando(ArrayList operando) {
        this.operando = operando;
    }

    public ArrayList getOperado() {
        return operado;
    }

    public void setOperado(ArrayList operado) {
        this.operado = operado;
    }

    public String toString() {
        return "Calculo{" + "operando=" + operando + ", operado=" + operado + '}';
    }
   
}