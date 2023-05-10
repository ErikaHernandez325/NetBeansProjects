/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4_rectangulo;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author erika
 */
public class POOEJ4_RECTANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRectangulo s1 = new ServicioRectangulo();
        Rectangulo r1 = s1.dimensionRectangulo();
        s1.superficie(r1);
        s1.perimetro(r1);
        s1.graficaRectangulo(r1);
        System.out.println(r1);
    }

}
