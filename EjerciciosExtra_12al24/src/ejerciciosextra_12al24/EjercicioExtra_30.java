/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_30 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int respuesta = 0, resultado = 0;
        //respuesta es ingresado por el usuario

        //se generan los numeros aleatorios 
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        System.out.println("El numero 1 es: " + num1 + " el numero 2 es: " + num2);
        resultado = num1 * num2;

        do {
            System.out.println("Adivine el resultado de la multiplicación");
            respuesta = leer.nextInt();
            if (respuesta!=resultado){
            System.out.println("Respuesta incorrecta");    
            }
            
        } while (respuesta != resultado);
         System.out.println("Respuesta correcta");
        
    }
}
