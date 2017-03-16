/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Enrique
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        String objeto1 = "Hola";
        String objeto2 = "Hola2";
        String objeto3 = "Hola3";
        
        
        
        conjunto.add(objeto1);
        conjunto.add(objeto2);
        conjunto.add(objeto3);
        conjunto.add(objeto1);
        
        for (String object : conjunto) {
            System.out.println(object.hashCode());
        }
        
        
        Set<Persona> conjunto2 = new HashSet<>();
        Persona p1 = new Persona();
        p1.setNombre("hernando");
        p1.setTelefono("342452354");
        System.out.println(p1.hashCode());
        Persona p2 = new Persona();
        p2.setNombre("hernando");
        p2.setTelefono("3424523543");
        System.out.println(p2.hashCode());
        
            conjunto2.add(p1);
        conjunto2.add(p2);
        
        for (Persona persona : conjunto2) {
            System.out.println(persona.toString());
            System.out.println(persona.hashCode());
        }
    }
    
}
