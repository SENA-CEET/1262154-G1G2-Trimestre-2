package co.edu.sena.ejerciciosarreglos;

import java.util.Scanner;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Arreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] a = new int[10];
        a[0]= 1;
        a[1]= 1;
        a[2]= 1;
        a[3]= 1;
        a[4]= 1;
        a[5]= 1;

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
            System.out.println(a);
        }
        for(int i = 0; i<a.length; i++){
            a[i]= teclado.nextInt();
        }




    }
}
