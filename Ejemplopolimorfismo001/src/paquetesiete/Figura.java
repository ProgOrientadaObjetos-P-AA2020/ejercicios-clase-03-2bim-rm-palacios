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
public abstract class Figura {

    protected String nombre;
    protected double area;

    public Figura(String n) {
        nombre = n;
    }

    public void establecerNombre(String carac) {
        nombre = carac;
    }

    /*
    Método abstracto calcularArea()
        // método sin impĺementar, se deja la responsabilidad 
        // a las clases derivadas
     */
    public abstract void calcular_area();

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerArea() {
        return area;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s",
                nombre);

        return cadena;
    }
}
