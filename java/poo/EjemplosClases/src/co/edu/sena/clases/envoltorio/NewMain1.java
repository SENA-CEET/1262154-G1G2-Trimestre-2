/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.envoltorio;

/**
 *
 * @author Enrique
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a = 8;
        Integer b = 5;

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if (a.equals(b)) {
            System.out.println("son iguales");

        } else {
            System.out.println("son diferentes");
        }
        System.out.println(a.compareTo(b));
        if (a.compareTo(b) > 0) {

            System.out.println("a es mayor que b");

        } else if (a.compareTo(b) == 0) {
            System.out.println("son iguales");
        } else if (a.compareTo(b) < 0) {
            System.out.println("a es menor que b");
        }

    }

}
