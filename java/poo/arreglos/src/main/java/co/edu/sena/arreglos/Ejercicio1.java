package co.edu.sena.arreglos;

import java.util.Scanner;

/**
 * Created by Enrique on 27/02/2017.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vector = new int[10];

        for (int i =0; i<vector.length; i++){
            vector[i]=teclado.nextInt();
        }
        int mayor = vector[0];

        for(int i =0; i<vector.length; i++){
            if(vector[i]>mayor){
                mayor= vector[i];
            }
        }
        System.out.println("el numero mayor es "+mayor);
        for(int i =0; i<vector.length; i++){
            if(vector[i]==mayor){
                System.out.println("el numero mayor se encuentra en la posicion "+i+" y tiene el valor "+vector[i]);
            }
        }




    }
}
