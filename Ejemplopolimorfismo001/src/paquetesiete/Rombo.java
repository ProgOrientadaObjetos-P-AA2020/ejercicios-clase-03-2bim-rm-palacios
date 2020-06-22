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

    int diagonalMenor;
    int diagonalMayor;

    public void establecerDiagonalMenor(int men) {
        diagonalMenor = men;
    }

    public void establecerDiagonalMayor(int may) {
        diagonalMayor = may;
    }

    @Override
    public void calcular_area() {
        area = (diagonalMayor * diagonalMenor)/2;
    }

    public int obtenerDiagonalMenor() {
        return diagonalMenor;
    }

    public int obtenerDiagonalMayor() {
        return diagonalMayor;
    }

}
