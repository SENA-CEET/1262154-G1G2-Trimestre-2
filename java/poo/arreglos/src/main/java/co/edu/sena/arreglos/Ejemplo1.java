package co.edu.sena.arreglos;

/**
 * Created by Enrique on 20/02/2017.
 */
public class Ejemplo1 {
    public static void main(String[] args) {

        int [] a = new int[100];
        System.out.println(a);
        a[0]=1;
        a[1]=2;
        a[1]=2;
        a[1]=2;

        int [] b = {1,2,3,4,5,6,7,8,9,10};


        System.out.println(a.length);

        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }



    }
}
