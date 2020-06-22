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

    int base;
    int altura;

    public void establecerBase(int b) {
        base = b;
    }

    public void establecerAltura(int a) {
        altura = a;
    }

    @Override
    public void calcular_area() {
        area = (base * altura)/2;
    }

    public int obtenerBase() {
        return base;
    }

    public int obtenerAltura() {
        return altura;
    }
}
