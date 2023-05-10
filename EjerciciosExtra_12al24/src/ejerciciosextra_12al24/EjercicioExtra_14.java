/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_14 {
   public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        double euros;
        System.out.println("Ingrese su monto en euros");
        euros= leer.nextDouble();
        conversion(euros);        
    }
    public static void conversion(double cant){
        Scanner leer = new Scanner(System.in);
        double yenes = 129.852;
        double libras = 0.86;
        double dolar = 1.28611;
        System.out.println("Elija el tipo de divisa al que quiere convertir su dinero");
        String divisa = leer.nextLine();
        switch(divisa){
            case "yenes":
                System.out.println("Sus euros equivalen a: "+cant*yenes+" yenes");
                break;
            case "libras":
                System.out.println("Sus euros equivalen a: "+cant*libras+" libras");
                break;
            case "dolar":
                System.out.println("Sus euros equivalen a: "+cant*dolar+" dolar");
                break;
            default:
                System.out.println("No cambiamos ese tipo de divisa");
                break;
                      
        }         
    }
} 

