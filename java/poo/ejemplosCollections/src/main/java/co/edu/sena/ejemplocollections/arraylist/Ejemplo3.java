/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        
        lista.add("cero");
        lista.add("uno");
        lista.add("dos");
        
        List<String> lista2 = new ArrayList<>(lista);
        
        System.out.println(lista.size());
        lista.remove(1);
        System.out.println(lista.size());
        for (String var : lista) {
            System.out.println(var);
            
        }
        System.out.println(lista2.size());
        for (String var2 : lista2) {
            System.out.println(var2);
            
        }
        
        
        
        
    }
    
}
