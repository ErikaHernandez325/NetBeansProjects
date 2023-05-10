/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_26 {
  public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantdad de alturas a leer");
        int N = leer.nextInt();
        double altura;
        //Variables totalizadoras y contadoras
        double sumaMenores = 0, suma = 0;
        int contMenores = 0, cont = 0;
        
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese una altura");
            altura = leer.nextDouble();
            if(altura < 1.60){
                sumaMenores += altura;
                contMenores ++;
            }
            suma += altura;
            cont ++;
        }
        System.out.println("El promedio de estatura por debajo de 1.60 es: "+sumaMenores/contMenores);
        System.out.println("El promedio de estatura en general es: "+suma/cont);
    }  
}
