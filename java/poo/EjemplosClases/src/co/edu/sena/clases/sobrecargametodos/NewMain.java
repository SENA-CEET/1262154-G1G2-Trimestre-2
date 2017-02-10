/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.sobrecargametodos;

import java.util.Date;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println(Calculadora.suma(5, 5));
        System.out.println(Calculadora.suma('a', 'b'));
        System.out.println(Calculadora.division(2, 2));
        
        System.out.println(Calculadora.conversionDecimalBinario(197));
        
//        for (int i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++) {
//            System.out.println(i+ "en caracter es : "+ ((char)i));
//        }
        
        
        
    }
    
}
