/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejercicioextra_6;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para calcular el doble, triple y raiz");
        Scanner leer= new Scanner(System.in);
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        int raiz = (int) Math.sqrt(num);
        System.out.println("El doble del numero ingresado es: "+doble);
        System.out.println("El triple del numero ingresado es: "+triple);    
        System.out.println("La raiz del numero ingresado es: "+raiz);
    }
    
}
