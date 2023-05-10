/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_16 {
 public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de su vector");
        int tam = leer.nextInt(),n,cont=0;
        int[] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] = (int)(Math.random()*100);
        }
        System.out.println("Ingrese un numero a buscar en el vector");
        n = leer.nextInt();
        for (int i = 0; i < tam; i++) {
            if (n==vector[i]){
                System.out.println("el numero se encuentra en el subindice "+i+" del vector");
                cont++;
            }
            
        }
        if (cont>1){
                System.out.println("el numero que busco esta repetido "+cont+" veces");
            }
        if(cont==0){
            System.out.println("El numero que busca no se encuentra en el vector");
        }
            }        
        
    }   
