/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.Arrays;

/**
 *
 * @author Enrique
 */
public class Ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a = new int[10];
        a[0]=5;
        a[1]=8;
        a[2]=5;
        a[3]=52;
        a[4]=53;
        a[5]=544;
        a[6]=55;
        a[7]=65;
        a[8]=5;
        a[9]=5;
        
        for (int i : a) {
            System.out.println(i);
        }
        
        Arrays.sort(a);
        
        for (int i : a) {
            System.out.println(i);
        }
        
    }
    
}
