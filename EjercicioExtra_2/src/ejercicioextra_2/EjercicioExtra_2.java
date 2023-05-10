/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicioextra_2;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre que quiere volver variable: ");
        String nombre = leer.nextLine();
        System.out.println("la variable es: "+nombre);
        
    }
    
}
