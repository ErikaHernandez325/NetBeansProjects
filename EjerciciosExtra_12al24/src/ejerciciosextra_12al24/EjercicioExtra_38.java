/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ejerciciosextra_12al24;

/**
 *
 * @author erika
 */
public class EjercicioExtra_38 {
      public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        String palabra;
        int fila, columna;
        //Rellenamos con numeroas aleatorios entre 0 y 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = Integer.toString((int)(Math.random()*9));
            }
        }
        //Agregamos nuestras palabras
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra = leer.next();
            while((palabra.length()<3)&&(palabra.length()>5)){
                System.out.println("Ingrese una palabra de 3 a 5 caracteres");
                palabra = leer.next();
            }
            fila = (int)(Math.random()*20);
            columna = (int)(Math.random()*15);
            for (int col = 0; col < palabra.length(); col++) {
                 matriz[fila][columna] = palabra.substring(col, col+1);
                 columna++;
            } 
        }
       //IMPRIMIMOS
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
           
    }
} 

