/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejercicioextra_7;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la frase: ");
        Scanner leer = new Scanner(System.in);
        String  frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
    
}
