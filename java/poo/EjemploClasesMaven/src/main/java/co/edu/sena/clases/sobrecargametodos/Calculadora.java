/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.clases.sobrecargametodos;

/**
 * Esta clase es para dearrollar las operaciones atemaicas de una calculadora
 *
 * @author Enrique
 * @since 1998
 * @version 1
 */
public class Calculadora {

    /**
     * Este metodo suma dos números donde el primero es double y el segundo es
     * entero
     *
     * @param a es un numero double
     * @param b es un numero entero
     * @return este metodo retorna la suma de a mas b
     *
     */
    public static double suma(double a, int b) throws ArithmeticException {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    public static short suma(short a, short b) {
        return (short) (a + b);
    }

    public static long suma(long a, long b) {
        return a + b;
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    public static char suma(char a, char b) {
        return (char) (a + b);
    }

    public static byte suma(byte a, byte b) {
        return (byte) (a + b);
    }

    /**
     * Este metodo hace la división de dos numeros enteros
     *
     * @param a primer número entero
     * @param b segundo número entero
     * @return retorna la division como un String
     */
    public static String division(int a, int b) {
        if (b == 0) {
            return "division por cero";
        } else {
            Integer div = a / b;
            return div.toString();
        }
    }

    public static String conversionDecimalBinario(int numero) {
        int div = numero;
        int residuo;
        String resultado = "";
        String resultadoFinal = "";
        while (div != 0) {
            residuo = div % 2;
            div = (int) div / 2;
            resultado += residuo;
        }
        for (int i = resultado.length() - 1; i >= 0; i--) {
            resultadoFinal = resultadoFinal + resultado.charAt(i);
        }
        return resultadoFinal;
    }

    public static String conversionDecimalOctal(int numero) {
        int div = numero;
        int residuo;
        String resultado = "";
        String resultadoFinal = "";
        while (div != 0) {
            residuo = div % 8;
            div = (int) div / 8;
            resultado += residuo;
        }
        for (int i = resultado.length() - 1; i >= 0; i--) {
            resultadoFinal = resultadoFinal + resultado.charAt(i);
        }
        return resultadoFinal;
    }

    public static String conversionDecimalHexadecimal(int numero) {
        int div = numero;
        int residuo;
        String resultado = "";
        String resultadoFinal = "";
        while (div != 0) {
            residuo = div % 16;
            div = (int) div / 16;
            switch (residuo) {
                case 10:
                    resultado += "A";
                    break;
                case 11:
                    resultado += "B";
                    break;
                case 12:
                    resultado += "C";
                    break;
                case 13:
                    resultado += "D";
                    break;
                case 14:
                    resultado += "E";
                    break;
                case 15:
                    resultado += "F";
                    break;
                default:
                     resultado += residuo;
            }

        }
        for (int i = resultado.length() - 1; i >= 0; i--) {
            resultadoFinal = resultadoFinal + resultado.charAt(i);
        }
        return resultadoFinal;
    }

}
