/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.encapsulamiento;

/**
 *
 * @author Enrique
 */
public class NewMain {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carrito = new Carro();
        carrito.setMarca("mazda");
        carrito.setColor("rojo");
        carrito.setModelo("2017");
        carrito.setPlaca("AAA123");
        carrito.setVelocidad(0F);
        
        System.out.println(carrito.getMarca());
        System.out.println(carrito.getVelocidad());
        carrito.acelerar();
        System.out.println(carrito.getVelocidad());
        carrito.frenar();
        carrito.frenar();
        System.out.println(carrito.getVelocidad());
    }
    
}
