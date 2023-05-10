/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_33 {
 public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese el tamaño de la escalera");
     int tam = leer.nextInt();
     
     System.out.println("******** Imprimiendo escalera ********");
    
     //indica la fila
     for (int i = 1; i < tam+1; i++) {
         //Imprime los numeros sin saltar de la fila i como limite 
         for (int j = 1; j < i+1; j++) {
             System.out.print(j);
         }
         System.out.println("");
     }
 }   
}
