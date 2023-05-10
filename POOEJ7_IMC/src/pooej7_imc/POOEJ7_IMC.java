/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7_imc;

import Entidades.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author erika
 */
public class POOEJ7_IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona ps = sp.crearPersona();
        sp.calcularIMC(ps);
        sp.mayoriaEdad(ps);
        System.out.println(ps);
    }
    
}
