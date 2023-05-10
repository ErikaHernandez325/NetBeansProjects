/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P..
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_21 {

    public static void main(String[] args) {
        int[][] m = new int[10][10];
        int[][] p = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }

        System.out.println("-----------------------------------");
        System.out.println("Ingrese numero:");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                p[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + p[i][j] + "]  ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------------Buscar----");
        int auxI = 0;
        int auxJ = 0;
        int f = 0, c = 0, cont = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < 10; i++) {
            f = 0;
            c = 0;
            for (j = 0; j < 10; j++) {
                if (p[f][c] == m[i][j]) {
                    cont = 0;
                    auxI = i;
                    auxJ = j;
                    for (f = 0; f < 3; f++) {
                        auxJ = j;
                        for (c = 0; c < 3; c++) {
                            if (p[f][c] == m[auxI][auxJ]) {
                                cont = cont + 1;
                            } else {
                                break;
                            }
                            if (auxJ < 9) {
                                auxJ++;
                            }
                        }
                        if (auxI < 9) {
                            auxI++;
                        }
                        if (cont == 9) {
                            break;
                        }
                    }

                }
                if (cont == 9) {
                    break;
                }
            }
            if (cont == 9) {
                break;
            }
        }

        if (cont == 9) {
            System.out.println("Matriz encontrada en esta posición [" + i + "][" + j + "]");
        } else {
            System.out.println("Matriz No encontrada");
        }

    }
}
