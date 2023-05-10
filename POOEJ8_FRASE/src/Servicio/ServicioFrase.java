/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author erika
 */
public class ServicioFrase {
    private String Frase;
    private int Longitud;
    Scanner leer=new Scanner(System.in);
 
   
        public ServicioFrase() {
    }


    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }
    
    public void crearCadena() {
        System.out.println("ingrese su frase");
        setFrase(leer.nextLine());
        setLongitud(Frase.length());
    }
    
    public void MostrarVocales(String s1){
        int cont = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.substring(i, i + 1).equals("a") 
                    || s1.substring(i, i + 1).equals("e") 
                    || s1.substring(i, i + 1).equals("i") 
                    || s1.substring(i, i + 1).equals("o") 
                    || s1.substring(i, i + 1).equals("u")) {
                cont++;
            }
        }
        System.out.println("la frase tiene "+cont+" vocales"); 
    }
         
         
    public static void InvertirFrase(String str) {
        System.out.println(new StringBuilder(str).reverse().toString());

    }

    public void VecesRepetido(String s1){
        String letra;
        int cont=0;
        for (int i = 0; i < getLongitud(); i++) {
             letra=Frase.substring(i, i+1);
            if(letra.equals(s1)){
                cont++;
        }
    }
        System.out.println("el caracter que ingreso esta "+cont+" veces en la frase");
    }
    
    public void compararLongitud(){
        System.out.println("ingrese la frase a comparar");
        String f=leer.nextLine();
        if(getLongitud()<f.length()){
            System.out.println("la longitud de la frase ingresada es mayor");
        }else{
            if(getLongitud()==f.length()){
                System.out.println("la longitud de la frase es igual a la del objeto");
            }else{
                System.out.println("la longitud de la frase ingresada es menor");
            }
        }
    }
    
    public void unirCadena(){
        System.out.println("ingrese la frase a unir");
        String f=leer.nextLine();
        System.out.println(getFrase()+" "+f);
    }
    
    public void reemplazar(String l) {
        String letra;
        for (int i = 0; i < getLongitud(); i++) {
            letra = Frase.substring(i, i + 1);
            if (letra.equals("a")) {
                letra = l;
            }
            System.out.print(letra);

        }
        System.out.println("");
    }
}
}
