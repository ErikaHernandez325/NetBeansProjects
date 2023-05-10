package Servicio;


import java.util.Scanner;
import Entidad.Libro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author erika
 */
public class ServicioLibro {
    public Libro crearLibro(){
        Libro lb = new Libro();
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese el código ISBN del libro:");
        lb.setIsbn(leer.nextInt());
        System.out.println("Ingrese el numero de paginas del libro");
        lb.setNumPaginas(leer.nextInt());
        System.out.println("Ingrese el titulo del libro:");
        lb.setTitulo(leer1.nextLine());
        System.out.println("Ingrese el nombre del autor");
        lb.setAutor(leer1.nextLine());
        return lb;
    
    }
    
}
