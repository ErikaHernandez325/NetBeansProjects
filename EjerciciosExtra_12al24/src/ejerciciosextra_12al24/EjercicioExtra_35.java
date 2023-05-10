/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_35 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2:");
        int num2 = leer.nextInt();
        int opcion = 0;
        //menu
        System.out.println("**** Menu ****");
        System.out.println("por favor seleccione una operación");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("la suma de los dos numeros es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("la resta de los dos numeros es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("la multiplicacion de los numeros es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("la division de los numeros es: " + (num1 / num2));
                break;
            case 5:
                System.out.println("Gracias por usar nuestro menú");
                break;

        }

    }
}
