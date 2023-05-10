/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejemplo;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author erika
 */
public class POO_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamar el servicio y se asigna la variable ps
        PersonaService ps = new PersonaService();
        //se asigna a la clase persona una variable p1
        Persona p1 = ps.crearPersona();
        //se visualiza la p1 con la clae servicio      
        //System.out.println(p1.toString());
        ps.mostrarPersona(p1);
    }
    
}
