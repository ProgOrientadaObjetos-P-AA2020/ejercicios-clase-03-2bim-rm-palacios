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
public class Rombo extends Figura {

    double diagonalMenor;
    double diagonalMayor;

    public Rombo(String n, double dM, double dMay) {
        super(n);
        diagonalMenor = dM;
        diagonalMayor = dMay;
    }

    public void establecerDiagonalMenor(double men) {
        diagonalMenor = men;
    }

    public void establecerDiagonalMayor(double may) {
        diagonalMayor = may;
    }

    @Override
    public void calcular_area() {
        area = (diagonalMayor * diagonalMenor) / 2;
    }

    public double obtenerDiagonalMenor() {
        return diagonalMenor;
    }

    public double obtenerDiagonalMayor() {
        return diagonalMayor;
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
