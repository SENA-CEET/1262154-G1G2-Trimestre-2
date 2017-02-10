/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.metodos;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leon simba = new Leon();
        simba.caminar(15F);
        System.out.println(simba.velocidad);
        simba.morir();
    }
    
}
