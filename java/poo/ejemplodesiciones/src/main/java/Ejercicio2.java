import java.util.Scanner;

/**
 * Created by Enrique on 21/02/2017.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int d1, d2;
        int num = teclado.nextInt();
        if(num > 9 && num <100){
            d1 = num/10;
            d2 = num%10;
            System.out.println("El primer digito es:"+d1);
            System.out.println("El segundo digito es:"+d2);
        }else {
            System.out.println("el numero que usted digito no tiene dos digitos");
        }
    }
}
