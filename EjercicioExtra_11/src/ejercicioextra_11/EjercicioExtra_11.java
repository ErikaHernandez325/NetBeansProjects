/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package ejercicioextra_11;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int n1 = leer.nextInt(), n2 = leer.nextInt();
        char r;
        boolean l = false;
        do {
            System.out.println("segun el siguiente menu elija sus opciones");
            System.out.println("MENU");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            byte s = leer.nextByte();
            switch (s) {
                case 1:
                    System.out.println("el resultado es " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("el resultado es " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("el resultado es " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("el resultado es " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    r = leer.next().charAt(0);

                    if (r == 's') {
                        l = true;
                        break;
                    }
                default:
                    System.out.println("numero incorrecto");
                    break;
            }
        } while (l == false);
    }
}
