import java.util.Scanner;

/**
 * Created by Enrique on 22/02/2017.
 */
public class Ejemplo6 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcion, a, b;
        do {
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5.  salir del programa");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("digite el numero 1");
                    a = teclado.nextInt();
                    System.out.println("digte el numero 2");
                    b = teclado.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("digite el numero 1");
                    a = teclado.nextInt();
                    System.out.println("digte el numero 2");
                    b = teclado.nextInt();
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println("digite el numero 1");
                    a = teclado.nextInt();
                    System.out.println("digte el numero 2");
                    b = teclado.nextInt();
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println("digite el numero 1");
                    a = teclado.nextInt();
                    System.out.println("digte el numero 2");
                    b = teclado.nextInt();
                    System.out.println(a / b);
                    break;
                case 5:
                    System.out.println("gracias por usar la calculadorsita");
                    break;
                default:
                    System.out.println("la opcion que selecciono no existe vuelva a intentarlo");
            }


        } while (opcion != 5);
    }
}
