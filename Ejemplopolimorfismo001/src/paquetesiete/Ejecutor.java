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
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int lado;
        int diagonalMenor;
        int diagonalMayor;
        int contador;
        int tipoFigura;
        ArrayList<Figura> figuras = new ArrayList<>();
        contador = 0;
        int lim = 4;
        while (contador <= lim) {
            // Se imprime mensaje en pantalla para solicitar
            // el tipo de estudiante que se desea ingresar
            System.out.println("Tipo de Figura a registrar\n"
                    + "Ingrese (1) para Cuadrado\n"
                    + "Ingrese (2) para Rombo\n"
                    + "Ingrese (3) para Triangulo");
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            tipoFigura = entrada.nextInt();
            entrada.nextLine();

            if (tipoFigura == 1) {
                // Declarar,crear e iniciar objeto tipo Cuadrado
                Cuadrado cuadrado = new Cuadrado();
                System.out.println("Ingrese el valor del lado");
                lado = entrada.nextInt();
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                cuadrado.establecerLado(lado);

                // Se agrega al arrayList figuras un objeto de tipo
                // cuadrado
                figuras.add(cuadrado);
            }
            if (tipoFigura == 2) {
                // Declarar,crear e iniciar objeto tipo Rombo
                Rombo rombo = new Rombo();
                System.out.println("Ingrese el valor de la diagonal mayor");
                diagonalMayor = entrada.nextInt();
                System.out.println("Ingrese el valor de la diagonal menor");
                diagonalMenor = entrada.nextInt();
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                rombo.establecerDiagonalMayor(diagonalMayor);
                rombo.establecerDiagonalMenor(diagonalMenor);

                // Se agrega al arrayList figuras un objeto de tipo
                // rombo
                figuras.add(rombo);
            } else {
                // Declarar,crear e iniciar objeto tipo Triangulo
                Triangulo triangulo = new Triangulo();
                System.out.println("Ingrese el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingrese el valor de la altura");
                altura = entrada.nextInt();
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                triangulo.establecerBase(base);
                triangulo.establecerAltura(altura);

                // Se agrega al arrayList figuras un objeto de tipo
                // triangulo
                figuras.add(triangulo);
            }

            contador = contador + 1;
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

