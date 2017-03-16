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
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        
        Object []a = lista.toArray();
        
        for (int i = 0; i < a.length; i++) {
            int nt = (Integer)a[i];
            System.out.println(nt);
        }
        
        
    }
    
}
