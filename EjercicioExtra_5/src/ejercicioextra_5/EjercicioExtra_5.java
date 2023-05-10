/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicioextra_5;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el numero:"); 
        Scanner leer= new Scanner(System.in);
        int num =leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("el numero ingresado es impar");
        }
        
    }
    
}
