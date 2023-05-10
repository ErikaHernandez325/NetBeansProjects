/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author erika
 */
public class Persona {
    //atributos
    
    public String nombre;
    public int numId;
    public String fechaNacimiento;

    public Persona() {
    }

    
    //clic izq inser code,constructor, seleccionamos los atributos
    public Persona(String nombre, int numId, String fechaNacimiento) {
        this.nombre = nombre;
        this.numId = numId;
        this.fechaNacimiento = fechaNacimiento;
    }
    
//clic izq insert code >> getter and set >>seleccionamos los campos>> generar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", numId=" + numId + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
