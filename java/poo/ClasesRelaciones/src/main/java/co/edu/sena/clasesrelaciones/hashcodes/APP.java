package co.edu.sena.clasesrelaciones.hashcodes;

/**
 * Created by Enrique on 2/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Hernando");
        Persona p2 = new Persona();
        p2.setNombre("Hernando");

        if(p1.equals(p2)){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }

    }
}
