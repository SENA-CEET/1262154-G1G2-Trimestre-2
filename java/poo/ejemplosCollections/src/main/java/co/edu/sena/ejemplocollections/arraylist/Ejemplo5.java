/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        List<Integer> lista = Arrays.asList(a);
        
        System.out.println(lista);
        
       
        
        for (Integer object : lista) {
            
            System.out.println(object);
            
        }
        
    }
    
}
