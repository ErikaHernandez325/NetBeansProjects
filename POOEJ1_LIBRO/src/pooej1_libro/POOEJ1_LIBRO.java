/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1_libro;

import Entidad.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author erika
 */
public class POOEJ1_LIBRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear el servicio
        ServicioLibro sl = new ServicioLibro();
        Libro l1 = sl.crearLibro();
        //System.out.println(l1.toString());
        System.out.println(l1);
    }
    
}
