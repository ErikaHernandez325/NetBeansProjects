/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejercicioextra_3;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author erika
 */
public class EjercicioExtra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Ingrese la frase que desea convertir a mayusculas y minusculas");
      Scanner leer = new Scanner(System.in);
      String frase = leer.nextLine();
      System.out.println(frase.toUpperCase());
      System.out.println(frase.toLowerCase());
    }
    
}
