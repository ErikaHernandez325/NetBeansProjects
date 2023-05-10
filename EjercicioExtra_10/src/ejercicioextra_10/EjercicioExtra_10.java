/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicioextra_10;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el valor limite positivo:");
        Scanner leer = new Scanner(System.in);
        int limite =leer.nextInt();
        int suma = 0;
        
        do {
            System.out.println("Ingrese el numero:"); 
            int num = leer.nextInt();
            suma += num;
            System.out.println("la suma es "+suma);
        } 
        while (suma <= limite);        
    
        
    }
    
}
