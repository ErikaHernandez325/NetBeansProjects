/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_36 {

    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;

        do {

            System.out.println("ingrese el nombre de la persona:");
            nombre = leer.nextLine();

            System.out.println("");

            nombre = nombre.toLowerCase();

            if (nombre.equals("no")) {
                break;
            } else {
                System.out.println("Ingrese la edad de ");
                edad = leer.nextInt();
                if (edad >= 18) {
                    System.out.println(nombre + " es mayor de edad");

                } else {
                    System.out.println(nombre + " es menor de edad");
                }
                //System.out.println(nombre.equals("no"));   
            }

            leer.nextLine();

        } while (!(nombre.equals("no")));

    }

}
