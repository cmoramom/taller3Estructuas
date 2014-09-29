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
public class Stack {
    
    public Dato top;
    

    
    //Coloca elementos en la Pila (desde arriba)
    public void push(int v) {
        if (top==null) {  // si la pila está vacía
            top = new Dato(v);  // crea el primer elemento de la Pila...
        } else {  // si ya hay algún elemento...
            Dato aux=new Dato(v); // crea la cajita nueva...
            aux.setDebajo(top); //enlaza el dato nuevo con el que esta en el top
            top=aux; //se actualiza el top ... al nuevo de arriba...
        }
    }
    public Dato pop() {
        Dato aux=top;
        if (top!=null) {
            top=top.getDebajo();
            aux.setDebajo(null);
        }
        return aux;
    }
    
    
    
     @Override
    public String toString() {
        String s="Pila:";
        Dato aux=top;  //ubico el primer elemento de la pila
        while (aux!=null) { //hago un ciclo para recorrer hacia abajo los elementos
            s+="\n"+aux;
            aux=aux.getDebajo();
        }
        return  s;
    }
    
    
}
