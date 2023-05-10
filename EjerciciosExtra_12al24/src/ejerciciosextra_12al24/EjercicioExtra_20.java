/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sd1 = 0, sd2 = 0, sf = 0, sc = 0, suma = 0;
        boolean mm = true;
        System.out.println("ingrese sus numeros en la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    matriz[i][j] = leer.nextInt();
                } while ((matriz[i][j] < 0) || (matriz[i][j] > 9));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        //primer diagonal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sd1 += matriz[i][j];
                }
            }
        }
        //segunda diagonal
        int j = 2;
        for (int i = 0; i < 3; i++) {
            sd2 += matriz[i][j];
            j--;
        }
        //suma fila y columna
        for (int i = 0; i < 3; i++) {
            sf += matriz[0][i];
            sc += matriz[i][0];
        }
        //comprobar fila
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            if (sf != suma) {
                mm = false;
            }
            suma = 0;
        }
        //comprobar columna
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma += matriz[j][i];
            }
            if (sc != suma) {
                mm = false;
            }
            suma = 0;
        }
        //comprobar matriz magica
        if (sc == sf && sc == sd1 && sc == sd2 && mm == true) {
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz magica");
        }
    }
}
