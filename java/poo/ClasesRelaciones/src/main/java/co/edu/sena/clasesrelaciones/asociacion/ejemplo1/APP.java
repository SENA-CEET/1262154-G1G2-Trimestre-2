package co.edu.sena.clasesrelaciones.asociacion.ejemplo1;

/**
 * Created by Enrique on 13/03/2017.
 */
public class APP {
    public static void main(String[] args) {
        Caballo c1 = new Caballo(new Ojo("rojo"), new Ojo("azul"), new Rinion("grande"),
                new Rinion("mediano"), new Corazon(120));
        System.out.println(c1.getCorazon().getLatidos());

    }
}
