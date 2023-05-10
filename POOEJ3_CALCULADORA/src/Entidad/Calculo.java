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
public class Calculo {
    //atributos
    private double num1;
    private double num2;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
    
    
    //constructores

    public Calculo() {
    }

    public Calculo(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculo(double num1, double num2, double suma, double resta, double multiplicacion, double division) {
        this.num1 = num1;
        this.num2 = num2;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
    }
    
    //Getter and Setter

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }
    
    //para mostrar 

    @Override
    public String toString() {
        return "Calculo{" + "num1=" + num1 + ", num2=" + num2 + ", suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + ", division=" + division + '}';
    }

    public void getResta(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
