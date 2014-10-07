/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4colas;

/**
 *
 * * @author carlos Mora, Lan Furbush, Katherine Bermudez, Gabriel Granados
 */
public class NodoC {
    
    private int dato;
   
    
   
    
   


    private NodoC atras;

    public NodoC(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "NodoC{" + "dato=" + dato + '}';
    }
    
    
    
    
}
