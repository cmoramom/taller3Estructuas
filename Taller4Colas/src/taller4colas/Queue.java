/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4colas;

/**
 *
 *  * @author carlos Mora, Lan Furbush, Katherine Bermudez, Gabriel Granados
 */
public class Queue {

    public NodoC frente;
    public NodoC ultimo;

    public void enCola(NodoC s) {
        if (frente == null) { //si la cola esta vacia

            frente = s;
            ultimo = s;

        } else { //hay elementos en la cola

            ultimo.setAtras(s);
            ultimo = s;

        }

    }

   public NodoC atiende() {
        NodoC aux = null;
        if (frente != null) {
            aux = frente;
            frente = frente.getAtras();
            if (frente != null) {
                aux.setAtras(null);
            } else {
                ultimo=null;
            }
        }
        return aux;
    }
    
    
    @Override
    public String toString() {
        String s="Cola: \n";
        NodoC aux=frente;
        while (aux!=null) {
            s+=aux+", \n";
            aux=aux.getAtras();
        }
        return s;
    } 
    

}
