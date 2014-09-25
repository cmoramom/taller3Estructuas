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
        Stack unaPila=new Stack();
        unaPila  = pila1;
        boolean existe=false;
        
        Dato p = pila1.pop();
        
        if (p.getValor() == x){
        
            return true;
        
        }
        
        
        return existe;
    }
    
    //ejercicio 3
    public static Dato extrae(int x) {
        Stack unaPila=new Stack();
        Dato aux=null;//...
        // adivinen...
        return aux;
    }
    
    //ejercicio 4
    public static void ordena() {
        Stack unaPila1=new Stack();
        Stack unaPila2=new Stack();
        // adivinen...
        
    }
    
    public static void imprime(){
        System.out.println(pila1);
    }
    
}

