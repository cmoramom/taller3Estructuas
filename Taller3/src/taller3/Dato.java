/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

public class Dato {
    
    public Dato(int valor) {
        this.valor = valor;
    }
    
    
    private int valor;
    private Dato debajo;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Dato getDebajo() {
        return debajo;
    }

    public void setDebajo(Dato debajo) {
        this.debajo = debajo;
    }

    
    
    @Override
    public String toString() {
        return "Dato{" + "valor=" + valor + '}';
    } 
}



