/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            lista.add(teclado.nextInt());
        }
        
        
        int suma =0;
        for (Integer numerito : lista) {
            suma+=numerito;
        }
        
        System.out.println("la suma de los datos de la coleccion es: "+suma);
    }
    
}
