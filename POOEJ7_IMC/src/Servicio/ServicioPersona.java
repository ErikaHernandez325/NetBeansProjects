/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author erika
 */
public class ServicioPersona {

    //instanciamos
    public Persona crearPersona() {
        Persona ps = new Persona();
        Scanner leer = new Scanner(System.in);
        Scanner leen = new Scanner(System.in);
        String sex;
        int aux;

        System.out.println("Ingrese el nombre de la persona");
        ps.setNombre(leer.nextLine());

        //condicion para verificar el genero ingresado
        do {
            System.out.println("Ingrese el sexo de la persona(H=hombre M=Mujer O=otro)");
            sex = leer.nextLine();
            if ((sex.length() == 1) && ((sex.equalsIgnoreCase("m")) || (sex.equalsIgnoreCase("h")) || (sex.equalsIgnoreCase("o")))) {
                ps.setSexo(sex);
                aux = 0;
            } else {
                aux = 1;
            }

        } while (aux > 0);

        System.out.println("Ingrese la edad:");
        ps.setEdad(leen.nextInt());
        System.out.println("Ingrese el peso en kg:");
        ps.setPeso(leen.nextDouble());
        System.out.println("Ingrese la altura en metros:");
        ps.setAltura(leen.nextDouble());
        return ps;

    }

    public void calcularIMC(Persona ps) {
        double imc;
        imc = (ps.getPeso() / Math.pow(ps.getAltura(), 2));

        if (imc < 20) {
            imc = -1;
            System.out.println("El indice de masa corporal de la persona es: " + imc + " está por debajo de su peso ideal");
        } else if (imc > 25) {
            imc = 1;
            System.out.println("El indice de masa corporal de la persona es: " + imc + " tiene sobrepeso");
        } else 
            
        {
            imc =0;
            System.out.println("El indice de masa corporal de la persona es: " + imc + " está en su peso ideal");
        }

    }

    public void mayoriaEdad(Persona ps) {

        System.out.println("La persona es mayor de edad:  " + (ps.getEdad() > 17));

    }
}
