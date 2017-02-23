package co.edu.sena.arreglos;

import java.util.Scanner;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Ejemplo4 {
    public static void main(String[] args) {
        int [] vector = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<vector.length;i++){
            vector[i]= teclado.nextInt();
        }
        for(int i = 0; i<vector.length;i++){
            System.out.println(vector[i]);
        }




    }

}
