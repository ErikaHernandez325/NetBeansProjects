/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjerciciosExtra_12al24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String codigo;
        String FDE = "&&&&&";
        int correctos = 0, incorrectos = 0;
        do{
            System.out.println("Ingrese su codigo");
            codigo= leer.nextLine();
            codigo= codigo.toUpperCase();
            if(codigo.equals(FDE)){
                break;
            }
            if(codigo.startsWith("X")&&codigo.endsWith("O")&&codigo.length()<=5){
                correctos++;
            }else{
                incorrectos++;
            }
            
        }while(!codigo.equals(FDE));
        System.out.println("La cantidad de lecturas correctas fue: "+correctos);
        System.out.println("La cantidad de lecturas incorrectas fue: "+incorrectos);
    }
}
