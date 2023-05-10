/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra_12al24;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class EjercicioExtra_27 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros a leer");
        //INICIALIZAMOS el minimo con un valor grande para poder compararlo. Viceversa con el maximo.
        int max = -999999, min = 999999, n = leer.nextInt(), cont = 0, num, total = 0;
        
        /*
        while(cont < n){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if(num > max){  //BUSCAMOS EL MAXIMO
                max = num;
            }
            if(num < min){ //BUSCAMOS EL MINIMO
                min = num;
            }
            total+= num; 
            cont++;
        }
        */
        do{
          System.out.println("Ingrese un numero");
          num = leer.nextInt();
          if(num > max){
              max = num;
            }
          if(num < min){
              min = num;
            }
          total+= num;
          cont++;  
        }while(cont<n);
        System.out.println("El valor minimo fue: "+min);
        System.out.println("El valor maximo fue: "+max);
        System.out.println("El promedio de "+n+" numeros fue: "+total/n); 
    }
  
}
