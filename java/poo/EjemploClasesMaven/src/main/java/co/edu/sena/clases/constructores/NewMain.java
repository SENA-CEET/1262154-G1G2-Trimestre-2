/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.constructores;

import java.math.MathContext;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablero t1 = new Tablero("rojo", "150x300", "acrilico");
        System.out.println(t1.getColor());
        System.out.println(t1.getMaterial());
        System.out.println(t1.getTamanio());
        
        
        Tablero t2 = new Tablero();
        
        
    }
    
}
