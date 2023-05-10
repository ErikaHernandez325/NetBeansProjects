/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Calculo;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioCalculadora {

    public Calculo crearOperacion() {
        Calculo cal = new Calculo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        cal.setNum1(leer.nextDouble());
        System.out.println("Ingrese el numero 2:");
        cal.setNum2(leer.nextDouble());
        return cal;
    }

    //generamos metodos por valor
    public void suma(Calculo cal) {
        cal.setSuma(cal.getNum1() + cal.getNum2());
        System.out.println("la suma de los numeros es: " + cal.getSuma());
    }

    public void resta(Calculo cal) {
        cal.setResta(cal.getNum1() - cal.getNum2());
        System.out.println("la resta de los numeros es: " + cal.getResta());
    }

    public void multiplicacion(Calculo cal) {
        if (cal.getNum1() == 0 || cal.getNum2() == 0) {
            System.out.println("Error uno de los numeros ingresados es igual a cero");
            cal.setMultiplicacion(0);
        } else {
            cal.setMultiplicacion(cal.getNum1() * cal.getNum2());
            System.out.println("la multiplicación de los numeros es: " + cal.getMultiplicacion());
        }
        
    }
        public void division(Calculo cal) {
        if (cal.getNum1() == 0 || cal.getNum2() == 0) {
            System.out.println("Error uno de los numeros ingresados es igual a cero");
            cal.setDivision(0);
        } else {
            cal.setDivision(cal.getNum1() / cal.getNum2());
            System.out.println("la division de los numeros es: " + cal.getDivision());
        }
        
    }
}
