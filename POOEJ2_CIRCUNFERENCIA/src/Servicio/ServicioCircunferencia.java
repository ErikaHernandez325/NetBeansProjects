/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author erika
 */
public class ServicioCircunferencia {

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        Circunferencia cir = new Circunferencia();
        System.out.println("ingrese el radio de la circunferencia:");
        cir.setRadio(leer.nextFloat());
        return cir;
    }

    public void Area(Circunferencia cir) {
        float a = (float) (Math.PI * Math.pow(cir.getRadio(), 2));
        cir.setArea(a);
        System.out.println("El area es: " + cir.getArea());
    }

    public void Perimetro(Circunferencia cir) {
        float p = (float) (2 * Math.PI * cir.getRadio());
        cir.setPerimetro(p);
        System.out.println("El perimetro es: " + cir.getPerimetro());
    }
}
