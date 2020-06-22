/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {

    double lado;

    public Cuadrado(String n) {
        super(n);
        
    }

    public void establecerLado(double l) {
        lado = l;
    }

    @Override
    public void calcular_area() {
        area = lado * lado;
    }

    public double obtenerLado() {
        return lado;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s\n", super.toString());
        cadenaFinal = String.format("%s"
                + "Area: %.2f\n",
                cadenaFinal,
                area);

        return cadenaFinal;
    }
}