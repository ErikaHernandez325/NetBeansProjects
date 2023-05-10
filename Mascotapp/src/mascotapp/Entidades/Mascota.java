/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.Entidades;

import java.util.Date;

/**
 *
 * @author erika
 */
public class Mascota {
    public String nombre;
    public Date nacimiento;
    public String raza;
    public Boolean cola;
    public int edad;
    public String color;

    public Mascota() {
    }

    public Mascota(String nombre, Date nacimiento, String raza, String color) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.raza = raza;
        this.color = color;
    }

    public Mascota(String nombre, Date nacimiento, String raza, Boolean cola, int edad, String color) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.raza = raza;
        this.cola = cola;
        this.edad = edad;
        this.color = color;
    }
    
    
}
