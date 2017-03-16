/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemplocollections.arraylist;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(teclado.nextInt());
        }
        int mayor = lista.get(0);
        //for normal
//        for (int i = 0; i < lista.size(); i++) {
//            if(lista.get(i)>mayor){
//            mayor= lista.get(i);
//            }
//        }

        for (int numero : lista) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("el numero mayor es: " + mayor);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == mayor) {
                System.out.println("el numero mayor esta en el posición: " + i);
            }
        }

    }

}
