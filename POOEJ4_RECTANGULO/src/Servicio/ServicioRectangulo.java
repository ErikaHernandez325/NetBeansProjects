/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioRectangulo {

    //instanciar
    public Rectangulo dimensionRectangulo() {
        Rectangulo rec = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        rec.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        rec.setAltura(leer.nextDouble());
        return rec;
    }

    public void superficie(Rectangulo rec) {
        rec.setSuperficie(rec.getAltura() * rec.getBase());
        System.out.println("El area de la superficie del rectangulo es:" + rec.getSuperficie());
    }

    public void perimetro(Rectangulo rec) {
        rec.setPerimetro((2 * rec.getAltura()) + (2 * rec.getBase()));
        System.out.println("El perimetro del rectangulo es: " + rec.getPerimetro());
    }

    public void graficaRectangulo(Rectangulo rec) {
        double a = rec.getAltura();
        double b = rec.getBase();

        for (int i = 1; i <= a; i++) {//Avanza por filas
            if (i == 1 || i == a) {
                for (int j = 0; j < b; j++) { //Avanza por columnas
                    System.out.print("*");
                }
            } else {//"""filas""" intermedias
                System.out.print("*");//asterisco """columna""" 1
                for (int j = 1; j < b - 1; j++) {//Avanza por columnas
                    System.out.print(" ");

                }
                System.out.print("*");//asterisco """columna""" N
            }//FIN DEL ELSE
            System.out.println("");
        }//FIN DEL PRIMER FOR
    }

}
