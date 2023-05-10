/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_24 {
public static void main(String[]args){
     Scanner leer = new Scanner(System.in);
     System.out.println("ingrese una letra");
     String letra = leer.next();
 
         if (!((letra.equalsIgnoreCase("a"))||(letra.equalsIgnoreCase("e"))||(letra.equalsIgnoreCase("i"))||(letra.equalsIgnoreCase("o"))||(letra.equalsIgnoreCase("u")))){
             System.out.println("El caracter ingresado no era una vocal");
         }
    }    
}
