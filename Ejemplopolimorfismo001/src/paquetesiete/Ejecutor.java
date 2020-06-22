/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();

        // Declarar,crear e iniciar objeto tipo Cuadrado
        Cuadrado cuadrados = new Cuadrado("Cuadrado", 3.5);
        figuras.add(cuadrados);

        Cuadrado cuadrados2 = new Cuadrado("Cuadrado", 5);
        figuras.add(cuadrados2);

        Cuadrado cuadrados3 = new Cuadrado("Cuadrado", 8);
        figuras.add(cuadrados3);

        Cuadrado cuadrados4 = new Cuadrado("Cuadrado", 2);
        figuras.add(cuadrados4);

         // Declarar,crear e iniciar objeto tipo Rombo
        Rombo rombo = new Rombo("Rombo", 4, 5.6);
        figuras.add(rombo);

        Rombo rombo2 = new Rombo("Rombo", 8, 2);
        figuras.add(rombo2);

        Rombo rombo3 = new Rombo("Rombo", 5, 5.5);
        figuras.add(rombo3);

         // Declarar,crear e iniciar objeto tipo Triangulo
        Triangulo trian1 = new Triangulo("Triangulo", 2, 5);
        figuras.add(trian1);

        Triangulo trian2 = new Triangulo("Triangulo", 4.5, 8);
        figuras.add(trian2);

        Triangulo trian3 = new Triangulo("Triangulo", 8, 8);
        figuras.add(trian3);

        Triangulo trian4 = new Triangulo("Triangulo", 2, 2);
        figuras.add(trian4);
        
        Triangulo trian5 = new Triangulo("Triangulo", 8.5, 9);
        figuras.add(trian5);
        



        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();

            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
