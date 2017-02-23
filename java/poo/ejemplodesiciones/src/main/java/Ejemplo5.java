import java.util.Scanner;

/**
 * Created by Enrique on 22/02/2017.
 */
public class Ejemplo5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int numero1 = teclado.nextInt();

        if(numero1==1){
            System.out.println("UNO");
        }else if(numero1==2){
            System.out.println("DOS");
        }else if(numero1==3){
            System.out.println("TRES");
        }else{
            System.out.println("yo no conosco ese numero");
        }

        switch (numero1){// jdk 1.4 solo acepta enteros y caracteres a partir del jdk 7 acepta String
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            default:
                System.out.println("yo no conosco ese numero");
        }




    }
}
