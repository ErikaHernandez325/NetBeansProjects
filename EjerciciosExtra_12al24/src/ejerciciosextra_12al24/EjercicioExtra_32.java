/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejerciciosextra_12al24;

/**
 *
 * @author erika
 */
public class EjercicioExtra_32 {

    public static void main(String[] args) {
        String a, b, c;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    a = Integer.toString(i);
                    b = Integer.toString(j);
                    c = Integer.toString(k);

                    //operador ternario es similar a un if, asigna un valor dependiendo de una condicion si es verdadero ? una accion y si es falso : accion
                    a = a.equals("3") ? "E" : a;
                    b = b.equals("3") ? "E" : b;
                    c = c.equals("3") ? "E" : c;
                    System.out.println(a + "-" + b + "-" + c);

                }

            }
        }

    }
}

