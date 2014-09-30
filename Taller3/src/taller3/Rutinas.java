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

       while (existe == false && p != null) {
   
            if (p.getValor() != x ) {
                p = p.getDebajo();
            }else existe = true;
        }
        return existe;

    }

    //ejercicio 3
    public static Dato extrae(int x) {
        Stack unaPila = new Stack();
        
        Dato p;
        Dato aux = null;
        p = pila1.top;
        //boolean existe = false;
       while ( p != null) {
   
           // existe = p.getValor() == x;
           // p.getDebajo();
            
            if (p.getValor() != x ){
                
                unaPila.push(p.getValor()); 
                aux = p.getDebajo();
                pila1.pop();
                p = aux;
                
           
           }else p = p.getDebajo();
            
         
       }
       aux = unaPila.top;
       pila1.top = aux;
       
       
     
       
       
        return aux;
        
        
        
        
        
        
        
        
       
    }

    //ejercicio 4
    public static void ordena() {
        Stack unaPila1 = new Stack();
        Stack unaPila2 = new Stack();
        Dato p = pila1.top; 
        int mayor = p.getValor();
        while (p !=  null){
            
            
            p = p.getDebajo();
        
        
        
        
        
        }
        
        
      

    }

    public static void imprime() {
        System.out.println(pila1.toString());
    }
    
   

}
