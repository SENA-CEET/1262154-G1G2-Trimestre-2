package co.edu.sena.arreglos;

import java.util.Scanner;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Ejemplo5 {
    public static void main(String[] args) {
        long a, con=0;
        Scanner teclado = new Scanner(System.in);
        a= teclado.nextLong();

        while (a!=0){
            con++;
            a = (long)a/10;
        }
        System.out.println(con);
        if(con<3){

            System.out.println("el numero tiene menos de dos digitos");
        }else{
            System.out.println("el numero tiene mas de dos digitos");
        }

    }
}
