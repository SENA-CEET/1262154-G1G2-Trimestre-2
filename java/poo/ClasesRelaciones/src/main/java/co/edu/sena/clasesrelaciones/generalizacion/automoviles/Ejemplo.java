package co.edu.sena.clasesrelaciones.generalizacion.automoviles;

/**
 * Created by Enrique on 16/02/2017.
 */
public class Ejemplo {
    public static void main(String[] args) {

        Camion camioncito = new Camion();

        Automovil var1 = (Automovil) camioncito;




        if(var1 instanceof Camion){

            System.out.println("el objeto camioncito es una instanción de la clase Camion");

        }





    }
}
