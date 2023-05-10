/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_19 {
public static void main(String[] args){
     Scanner leer=new Scanner(System.in);
        System.out.println("ingrese su tamaño de fila");
        int fila=leer.nextInt();
        System.out.println("ingrese su numero de columnas");
        int col=leer.nextInt();
        boolean as = true;
        int[][] matriz= new int[fila][col];
        for(int i=0;i<fila;i++){
            for(int j=0;j<col;j++){
                 matriz[i][j] = matriz[i][j] = (int) (Math.random() * 9)-4 ;
                 //el - 4 es para obtener numeros negativos y que el mayor sea 5
            }
        } 
        for(int i=0;i<fila;i++){
           for(int j=0;j<col;j++){
               System.out.print(matriz[i][j]+" ");
           }
            System.out.println("");
        }
        System.out.println("-----------");
        if(fila!=col){
            System.out.println("la matriz no es cuadrada,por lo que no puede ser antisimetrica");
        }else{
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < col; j++) {
                    if (matriz[i][j] != -matriz[j][i]) {
                        //-matriz[j][i] es para invertir el signo de los valores de la primera matriz y para trasponer
                        as = false;
                        // as es para verificar que la matriz sea simetrica
                        break;
        }       
         }
          }
      
   if(as==true){
             System.out.println("la matriz es una matriz anti simetrica");
         }else{
             System.out.println("la matriz no es una matriz antisimetrica");
         }
  }
    }
}

