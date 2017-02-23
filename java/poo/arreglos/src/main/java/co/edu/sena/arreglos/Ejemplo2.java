package co.edu.sena.arreglos;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        String [] arreglosCadenas = new String[5];
        System.out.println(arreglosCadenas);
        arreglosCadenas[0]= "hola mundo 1";
        arreglosCadenas[1]= "hola mundo 2";
        arreglosCadenas[2]= "hola mundo 3";
        arreglosCadenas[3]= "hola mundo 4";
        arreglosCadenas[4]= "hola mundo 5";

        for(int i = 0; i< arreglosCadenas.length; i++){
            System.out.println(arreglosCadenas[i]);
        }
        //foreach for para manejar objetos en arreglos o collections
        for (String cadena: arreglosCadenas) {
            System.out.println(cadena);
        }






    }
}
