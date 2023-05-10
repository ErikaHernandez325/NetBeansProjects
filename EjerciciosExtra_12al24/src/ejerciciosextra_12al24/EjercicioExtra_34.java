/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_34 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int fam = leer.nextInt();
        int hijos = 0, edad = 0, cont = 0, sum = 0;
        float promedioEdad = 0;

        for (int i = 0; i < fam; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i + 1));
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + (j + 1) + " de la familia " + (i + 1));
                edad = leer.nextInt();
                sum += edad;
                cont++;
            }
        }

        promedioEdad = (float) (sum / cont);
        System.out.println("la edad promedio de las hijos de las familias es: " + promedioEdad);
    }
}
