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
public class Rectangulo {

    //atributos
    private double base;
    private double altura;
    private double superficie;
    private double perimetro;

    //constructor
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double superficie, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }

    //getter and setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //mostrar
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }

}
