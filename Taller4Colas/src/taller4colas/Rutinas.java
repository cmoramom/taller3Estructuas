/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4colas;

/**
 *
 * @author carlos Mora, Lan Furbush, Katherine Bermudez, Gabriel Granados
 */
public class Rutinas {
    
    public static Queue cola;

    static {
        cola = new Queue();
        cola.enCola( new NodoC(10));
        cola.enCola( new NodoC(20));
        cola.enCola( new NodoC(75));
        cola.enCola( new NodoC(22));
        cola.enCola( new NodoC(56));
        cola.enCola( new NodoC(23));
        cola.enCola( new NodoC(66));
        cola.enCola( new NodoC(52));
        
        
        
    }
    
    
    
    
    

    public boolean buscar(int x) {
        
        /*se recorre la cola en buscando si el elemento x se encuentra en dicha pila
         si el elemento se encuentra se asigno true a una bandera de lo contrario se asigna false*/
        
        
        Queue queue = new Queue();
        queue = cola;
        boolean encontrado = false;
        NodoC nodo = queue.frente;
        
        /* recorre la cola en buscao del elemento solcitado
        si lo encuentra asigna a una bandera el valor true sino devuelve false
        */
        while ((nodo != null) && (!encontrado)) {                
            
            if (x == nodo.getDato()) {
                encontrado = true;
            } else {
                
                nodo = nodo.getAtras(); /*asigan al nodo en el que se consulta el valor el
                                         la posicion de atras del elemento de la cola donde este e
                                        el puntero*/ 
            }
        }
        return encontrado;
    }
    
    
    
    public String imprimir(){
    
    
    return cola.toString();
    }
    
    
    
     public NodoC extrae(int x) {
        Queue unaCola = new Queue();

        NodoC p;
        NodoC aux = null;
        p = cola.frente;
        /*este metodo realiza el corrido de la cola pasando a una pila temporal 
         los elementos que no concuerdan con el elemente buscado para despues asignar
         la pila temporal a la nueva pila origen*/

        while (p != null) {

            if (p.getDato() != x) {

                unaCola.enCola(new NodoC (p.getDato())); // se encolan los elementos que no son                aux = p.getAtras();                                                 
                cola.atiende();                           // el numero que se debe de extraer
                p = aux;

            } else {
                p = p.getAtras();
            }

        }
        
        aux = unaCola.frente; //se asigna la cola temporal a una variable
        cola.frente = aux;   // se asigna la cola temporal a la pila original

        return aux;

    }
     
     public  void ordenar() {
        Queue ordenada = new Queue();
        Queue temporal = new Queue();
        NodoC mayor = cola.atiende();
        /* este metodo se utiliza para ordenar la cola de ascendentemente*/
        
        while (mayor != null) {
            NodoC aux = cola.atiende();
            while (aux != null) {  // recorremos la col aen busca del mayor
                if (aux.getDato()> mayor.getDato()) {
                    temporal.enCola(new NodoC (mayor.getDato()));  //asiganmos le valor a la cola temporal
                    mayor = aux;                                   //y asigamos el mayor encontrado
                } else {
                    temporal.enCola(new NodoC(aux.getDato())); //  //asiganmos el numero que no es mayor
                }
                aux = cola.atiende();
            }
            ordenada.enCola(new NodoC (mayor.getDato()));
            cola = temporal;
            temporal = new Queue();
            mayor = cola.atiende();
        }
       cola = ordenada;
    }
    
    
    
    
    
    
    
    

}


