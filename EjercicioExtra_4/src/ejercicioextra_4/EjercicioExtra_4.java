/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicioextra_4;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese los grados centigrados a convertir a fahrenheit: ");
        Scanner leer = new Scanner(System.in);
        int gradosCentigrados = leer.nextInt();
        int gradosFahrenheit = 32 + (9*gradosCentigrados/5);
        System.out.println("Los "+gradosCentigrados+" ºc equivales a "+gradosFahrenheit+" ºF");
        
    }
    
}
