/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio13;

import java.util.Scanner;


public class JavaEjercicio13 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el nombre del participante del equipo "+i);
            equipo[i] = leer.nextLine();
            }
        
        //para visualizar el vector
        for (int i = 0; i < 8; i++) {
            System.out.print("["+equipo[i]+"]");
           
        }
         System.out.println("");
        }
        
    }
    
