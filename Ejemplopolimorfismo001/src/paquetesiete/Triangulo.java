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
public class Triangulo extends Figura {

    double base;
    double altura;

    public Triangulo(String n) {
        super(n);
       
    }

    public void establecerBase(double b) {
        base = b;
    }

    public void establecerAltura(double a) {
        altura = a;
    }

    @Override
    public void calcular_area() {
        area = (base * altura) / 2;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
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
