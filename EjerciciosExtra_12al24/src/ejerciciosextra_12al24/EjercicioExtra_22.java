/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de minutos");
        int min = leer.nextInt(), hs, dias;
        hs = (int) min / 60;
        if (hs < 24) {
            dias = 0;
        } else {
            dias = (int) hs / 24;
            if (!(hs % 24 == 0)) {
                System.out.println(hs % 24);
                hs = hs % 24;
            }
            //hs -= dias*24;
        }
        System.out.println(dias + " dias, " + hs + " horas.");

    }
}
