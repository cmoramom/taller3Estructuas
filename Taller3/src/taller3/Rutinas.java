/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author carlos
 */
public class Rutinas {

    public static Stack pila1;

    static {
        pila1 = new Stack();
        pila1.push(10);
        pila1.push(20);
        pila1.push(40);
        pila1.push(110);
        pila1.push(1);
    }

    //ejercicio 2
    public static boolean busca(int x) {
        Stack unaPila = new Stack();
        unaPila = pila1;
        boolean existe = false;
        Dato p = unaPila.top;

        /*se recorre la pila en buscando si el elemento x se encuentra en dicha pila
         si el elemento se encuentra se asigno true a una bandera de lo contrario se asigna false*/
        while (existe == false && p != null) {

            if (p.getValor() != x) {
                p = p.getDebajo();
            } else {
                existe = true;
            }
        }
        return existe;

    }

    //ejercicio 3
    public static Dato extrae(int x) {
        Stack unaPila = new Stack();

        Dato p;
        Dato aux = null;
        p = pila1.top;
        /*este metodo realiza el corrido de la pila pasando a una pila temporal 
         los elementos que no concuerdan con el elemente buscdo para despues asignar
         la pila temporal a la nueva pila origen*/

        while (p != null) {

            if (p.getValor() != x) {

                unaPila.push(p.getValor());
                aux = p.getDebajo();
                pila1.pop();
                p = aux;

            } else {
                p = p.getDebajo();
            }

        }
        aux = unaPila.top; //se asigna la pila temporal a una variable
        pila1.top = aux;   // se asigna la pila temporal a la pila original

        return aux;

    }

    //ejercicio 4
  public static void ordena() {
        Stack unaPila1 = new Stack();
        Stack unaPila2 = new Stack();
        Dato p = pila1.top;
        unaPila1 = pila1;

        int mayor = 0;
        int mayorAnterior = 0;

        while (p != null) {
            mayor = p.getValor();
            Dato p2 = unaPila1.top.getDebajo();
            p2 = p.getDebajo();
            while (p2 != null) {

                if (mayor < p2.getValor()) {
                    mayor = p2.getValor();

                }

                p2 = p2.getDebajo();

            }

            if (mayor != mayorAnterior) {
                unaPila2.push(mayor);
                
                pila1.pop();
                p = pila1.top;
                mayorAnterior = mayor;

            } else {
                p = p.getDebajo();
            }

        }
        
        Dato aux = unaPila2.top;
        pila1.top = aux;

    }

    public static void imprime() {
        System.out.println(pila1.toString());
    }

}
