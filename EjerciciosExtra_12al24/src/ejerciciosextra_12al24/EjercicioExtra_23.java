/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_23 {
      public static void main(String[]args){
       Scanner leer = new Scanner(System.in); 
       int a, b , c ,d , aux;
        System.out.println("Ingrese 4 valores");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        
        aux = b; 
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("YA HECHOS LOS INTERCAMBIOS");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }  
}
