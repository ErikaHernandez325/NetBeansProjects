/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_28 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int contPares = 0, contImpares = 0;

        do {
            System.out.println("Ingrese el numero");
            num = leer.nextInt();

            if (num > 0) {
                if (num % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }

        } while (num % 5 != 0);
        System.out.println("la cantidad de numeros pares ingresados es: "+contPares);
        System.out.println("la cantidad de numeros impares ingresados es: "+contImpares);
        
        
    }
}
