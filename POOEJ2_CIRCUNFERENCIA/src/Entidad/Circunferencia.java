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
public class Circunferencia {
   //Atributo
    private float radio;
    private float area;
    private float perimetro;


    //constructores

    public Circunferencia() {
    }

    public Circunferencia(float radio, float area, float perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }
    

    //Getters and Setter

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
 
    
}
