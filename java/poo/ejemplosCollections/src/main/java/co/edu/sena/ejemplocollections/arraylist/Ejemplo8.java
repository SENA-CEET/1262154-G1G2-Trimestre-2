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
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(9);
        lista.add(7);
        lista.add(5);
        lista.add(8);
        lista.add(3);
        lista.add(2);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        
    }
    
}
