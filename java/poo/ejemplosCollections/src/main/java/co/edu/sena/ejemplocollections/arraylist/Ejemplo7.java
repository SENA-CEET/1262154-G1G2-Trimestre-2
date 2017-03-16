/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Integer> lista1 = new ArrayList<>();
       List<Integer> lista2 = new ArrayList<>();
       lista1.add(1);
       lista1.add(2);
       lista1.add(3);
       
       lista2.add(4);
       lista2.add(5);
       lista2.add(6);
       lista2.add(7);
       System.out.println(lista2);
        for (int i = 0; i < lista1.size(); i++) {
            lista2.set(i, lista1.get(i));
        }
        
        System.out.println(lista2);
        
        
    
    }
    
}
