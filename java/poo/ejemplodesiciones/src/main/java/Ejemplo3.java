import java.util.Scanner;

/**
 * Created by Enrique on 21/02/2017.
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] a = new int[10];

        int i =0;
        while(i<10){
            a[i]= teclado.nextInt();
            i=i+1;
        }

        i=0;
        while(i<10){
            if(a[i]%10==4){
                System.out.println("el numero en la posicion "+i+" termina en 4 y contiene el valor: "+a[i]);
            }
            i=i+1;

        }



    }
}
