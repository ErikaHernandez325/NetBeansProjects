/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3_calculadora;

import Entidad.Calculo;
import Servicio.ServicioCalculadora;

/**
 *
 * @author erika
 */
public class POOEJ3_CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCalculadora s1 = new ServicioCalculadora();
        Calculo c1 = s1.crearOperacion();
        s1.suma(c1);
        s1.resta(c1);
        s1.multiplicacion(c1);
        s1.division(c1);
        System.out.println(c1);
        
        
        
    }
    
}
