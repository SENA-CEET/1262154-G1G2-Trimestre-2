package co.edu.sena.clasesrelaciones.asociacion.ejemplo5;

/**
 * Created by Enrique on 16/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Estante e1 = new Estante(10);
        Balon b1 = new Balon();
        e1.aregarBalon(b1);
        Balon b2 = new Balon();
        e1.aregarBalon(b2);
        Balon b3 = new Balon();
        e1.aregarBalon(b3);
        Balon b4 = new Balon();
        e1.aregarBalon(b4);

        for(int i =0; i<e1.getCantidadActual();i++){
            System.out.println(e1.getBalones()[i]);
        }
        System.out.println("---------------");
        e1.quitarBalon(b2);

        for(int i =0; i<e1.getCantidadActual();i++){
            System.out.println(e1.getBalones()[i]);
        }




    }
}
