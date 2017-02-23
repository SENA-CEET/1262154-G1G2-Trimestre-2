package co.edu.sena.arreglos;

import java.util.Scanner;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Ejemplo6 {
    public static void main(String[] args) {
        long a, con=0;
        Scanner teclado = new Scanner(System.in);
        a= teclado.nextLong();

        for (int i=1; i <= a;i++){
            if(a % i == 0){
                con++;
            }

        }
        if(con == 2){
            System.out.println("el numero es primo");
        }else{
            System.out.println("el numero no es primo");
        }
    }
}
