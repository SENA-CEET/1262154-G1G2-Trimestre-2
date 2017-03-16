/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List arrayList1 = new ArrayList();
   
    arrayList1.add(1);
    arrayList1.add(2);
    arrayList1.add(3);
   
    List arrayList2 = new ArrayList();
   
   arrayList2.add(4);
    arrayList2.add(5);
//    arrayList2.add(6);
//    arrayList2.add(7);
//    arrayList2.add(8);
    
    
   
    
   
    System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);
   
    
    Collections.copy(arrayList2,arrayList1);
   
    
 
    System.out.println("After copy, Second ArrayList Contains : " + arrayList2);  
        
    }
    
}
