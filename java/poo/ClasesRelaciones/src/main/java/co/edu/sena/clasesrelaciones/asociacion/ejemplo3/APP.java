package co.edu.sena.clasesrelaciones.asociacion.ejemplo3;

/**
 * Created by Enrique on 16/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Canasta canasta1 = new Canasta(10);
        canasta1.getBalones()[0]=new Balon();
        canasta1.getBalones()[1]=new Balon();
        canasta1.getBalones()[2]=new Balon();
        canasta1.getBalones()[3]=new Balon();

        for (Balon baloncito: canasta1.getBalones()) {
            System.out.println(baloncito);

        }
    }



}
