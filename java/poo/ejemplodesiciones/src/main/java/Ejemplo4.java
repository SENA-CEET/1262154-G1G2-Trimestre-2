import java.util.Scanner;

/**
 * Created by Enrique on 22/02/2017.
 */
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        int digito1, digito2, digito3, digito4;

        digito1= numero1/10;
        digito2= numero1%10;

        digito3= numero2/10;
        digito4= numero2%10;

        if (digito1 == digito3 || digito1 == digito4)
            System.out.println("el " + digito1 + " es comun en ambos numeros");



        if (digito2 == digito3 || digito2 == digito4)
            System.out.println("el " + digito2 + " es comun en ambos numeros");



    }
}
