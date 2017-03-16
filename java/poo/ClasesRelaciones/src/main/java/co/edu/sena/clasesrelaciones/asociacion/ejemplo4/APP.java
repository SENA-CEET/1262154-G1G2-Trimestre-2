package co.edu.sena.clasesrelaciones.asociacion.ejemplo4;

/**
 * Created by Enrique on 16/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Canasta c1 = new Canasta(10);
        c1.aregarBalon(new Balon());
        c1.aregarBalon(new Balon());
        c1.aregarBalon(new Balon());
        c1.aregarBalon(new Balon());
        c1.aregarBalon(new Balon());

        for(int i=0; i<c1.getCantidadActual();i++){
            System.out.println(c1.getBalones()[i]);
        }
    }
}
