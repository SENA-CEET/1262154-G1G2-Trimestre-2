/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.derivativo;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.setLadoA(2);
        r1.setLadoB(2);
        System.out.println(r1.getArea());
    }
    
}
