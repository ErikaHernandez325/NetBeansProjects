/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_29 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int residuo = 0, cociente = 0;

        System.out.println("Ingrese el numero divisor:");
        num1 = leer.nextInt();
        while (num1 < 1) {
            System.out.println("Ingrese el numero divisor:");
            num1 = leer.nextInt();
        }
        System.out.println("Ingrese el numero dividendo:");
        num2 = leer.nextInt();
        while (num2 < 1) {
            System.out.println("Ingrese el numero dividendo:");
            num2 = leer.nextInt();
        }

        residuo = num1;
        while (residuo > num2) {
            residuo = residuo - num2;
            //System.out.println("el residuo es "+residuo);
            cociente++;
        }

        System.out.println("El residuo de la division es " + residuo + " y el cociente es " + cociente);

    }
}
