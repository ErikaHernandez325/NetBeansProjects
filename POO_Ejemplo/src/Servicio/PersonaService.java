/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class PersonaService {
    //metodo publico de persona para crear personas, iniciar el nombre en minuscula, se importa le entidad persona
    public Persona crearPersona(){
        //solicita
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de la persona:");   
        String nombre = leer.nextLine();
        System.out.println("Ingrese la fecha de nacimiento");
        String fechaNacimiento = leer.nextLine();
        System.out.println("ingrese la edad:");
        int edad = leer.nextInt();
        
        leer.nextLine();
        
        //asigna los valores a los atributos, llama al constructor
     return new Persona(nombre,edad,fechaNacimiento);
     
}
    
    public void mostrarPersona(Persona p){
        System.out.println("El nombres es: "+p.getNombre());  
        System.out.println("la edad es: "+p.getNumId()); 
        System.out.println("La fecha de nacimiento es: "+p.getFechaNacimiento());
    }
}
