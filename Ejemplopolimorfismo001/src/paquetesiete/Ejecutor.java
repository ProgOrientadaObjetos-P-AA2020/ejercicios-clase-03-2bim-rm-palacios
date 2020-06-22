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

        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo de figura a calcular\n"
                + "Ingrese (1) Cuadrado\n"
                + "Ingrese (2) Rombo\n"
                + "Ingrese (3) Triangulo");
        int tipoFigura = entrada.nextInt();
        entrada.nextLine();

        if (tipoFigura == 1) {
            for (int i = 0; i < 4; i++) {
                Cuadrado cuadrado = new Cuadrado("CUADRADO");
                System.out.println("Ingrese el valor de uno de sus lados");
                double lado = entrada.nextDouble();
                cuadrado.establecerLado(lado);

                figuras.add(cuadrado);
            }
        }
        if (tipoFigura == 2) {
            for (int i = 0; i < 3; i++) {
                Rombo rombo = new Rombo("ROMBO");
                System.out.println("Ingrese el valor de la diagonal mayor");
                double mayor = entrada.nextDouble();
                System.out.println("Ingrese el valor de la diagonal menor");
                double menor = entrada.nextDouble();

                rombo.establecerDiagonalMayor(mayor);
                rombo.establecerDiagonalMenor(menor);

                figuras.add(rombo);
            }
        }
        if (tipoFigura == 3) {
            for (int i = 0; i < 5; i++) {
                Triangulo triangulo = new Triangulo("TRIANGULO");
                System.out.println("Ingrese el valor de la base del triangulo");
                double base = entrada.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                double altura = entrada.nextDouble();

                triangulo.establecerBase(base);
                triangulo.establecerAltura(altura);

                figuras.add(triangulo);
            }
        }

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
