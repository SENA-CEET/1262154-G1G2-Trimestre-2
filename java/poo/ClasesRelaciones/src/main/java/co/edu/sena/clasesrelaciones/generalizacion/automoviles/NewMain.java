/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clasesrelaciones.generalizacion.automoviles;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    Camion auto1 = new Camion();
    auto1.setColor("rojo");
    auto1.setMarca("mazda");
    auto1.setPlaca("a1234");
    auto1.setSillas(2);
    auto1.setColorCarpa("negra");

    imprimirAuto(auto1);

    Taxi taxi1 = new Taxi("renault", "amarillo", "asd1234", 4,12);

    imprimirAuto(taxi1);

        System.out.println( taxi1.getClass());

        Method metodos[] = taxi1.getClass().getMethods();



        
        
        
        
    }

    public static void imprimirAuto(Automovil auto){

        if(auto instanceof Camion) {
            Camion c1 = (Camion) auto;
            System.out.println("soy un camion");
            System.out.println(c1.getColor());
            System.out.println(auto.getMarca());
            System.out.println(auto.getPlaca());
            System.out.println(auto.getSillas());
            System.out.println(c1.getColorCarpa());
        } else if(auto instanceof Taxi){
            Taxi t1 = (Taxi)auto;
            System.out.println("soy un tai");
            System.out.println(t1.getSillas());
            System.out.println(t1.getTaximetro());
            System.out.println(t1.getPlaca());
            System.out.println(t1.getColor());
            System.out.println(t1.getMarca());

        }



    }
    
}
