/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.envoltorio;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //primitivo
        int a = 2147483647;
        
        Integer b =a;
        long atl = (long)a;
        double ard = a;
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println(a);
        System.out.println(ard);
        //referencia wrapper
        
        Integer aa = 5;
        
        
        String numero = "20";
        
        int nume =Integer.parseInt(numero);
        System.out.println(nume);
        
    }
    
}
