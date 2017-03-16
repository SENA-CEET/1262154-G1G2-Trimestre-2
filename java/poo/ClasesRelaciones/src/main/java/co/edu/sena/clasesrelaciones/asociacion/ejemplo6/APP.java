package co.edu.sena.clasesrelaciones.asociacion.ejemplo6;

/**
 * Created by Enrique on 16/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Estante e1 = new Estante();
        Balon b1 = new Balon(1);
        e1.getBalones().add(b1);
        Balon b2 = new Balon(2);
        e1.getBalones().add(b2);
        Balon b3 = new Balon(3);
        e1.getBalones().add(b3);
        Balon b4 = new Balon(4);
        e1.getBalones().add(b4);

        for (Balon baloncito : e1.getBalones()
                ) {
            System.out.println(baloncito.getNumero());

        }
        System.out.println("---------");
        Balon ba = new Balon(2);
        e1.getBalones().remove(ba);
        for (Balon baloncito : e1.getBalones()
                ) {
            System.out.println(baloncito.getNumero());

        }


    }
}
