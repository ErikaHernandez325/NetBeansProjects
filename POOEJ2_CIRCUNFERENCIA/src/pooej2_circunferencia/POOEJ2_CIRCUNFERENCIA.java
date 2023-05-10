/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2_circunferencia;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

/**
 *
 * @author erika
 */
public class POOEJ2_CIRCUNFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCircunferencia s1= new ServicioCircunferencia();
        Circunferencia c1 = s1.crearCircunferencia();
        s1.Area(c1);
        s1.Perimetro(c1);
        System.out.println(c1);
    }
    
}
