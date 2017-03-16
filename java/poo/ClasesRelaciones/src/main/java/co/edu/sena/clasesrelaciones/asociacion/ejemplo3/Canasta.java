package co.edu.sena.clasesrelaciones.asociacion.ejemplo3;

/**
 * Created by Enrique on 16/03/2017.
 */
public class Canasta {
    private Balon [] balones;

    public Canasta(int cantidad) {
        this.balones = new Balon[cantidad];
    }

    public Balon[] getBalones() {
        return balones;
    }
}
