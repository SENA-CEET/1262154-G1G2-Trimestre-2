/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplomaleta;

/**
 *
 * @author Enrique
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maleta m1 = new Maleta();
        m1.setColor("rojo");
        m1.setFomar("triangular");
        m1.setMarca("Adidas");
        m1.setMaterial("cuero");
        
        System.out.println(m1);
        System.out.println(m1.getColor());
        System.out.println(m1.getFomar());
        System.out.println(m1.getMarca());
        System.out.println(m1.getMaterial());
        Maleta m2 = new Maleta();
        m2.setColor("azul");
        m2.setFomar("cuadrada");
        m2.setMarca("Adidas");
        m2.setMaterial("lona");
        
        System.out.println(m2);
        System.out.println(m2.getColor());
        System.out.println(m2.getFomar());
        System.out.println(m2.getMarca());
        System.out.println(m2.getMaterial());
        
        
        
        
        
        
    }
    
}
