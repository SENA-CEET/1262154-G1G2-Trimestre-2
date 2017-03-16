package co.edu.sena.clasesrelaciones.asociacion.ejemplo6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 16/03/2017.
 */
public class Estante {

    private List<Balon> balones;

    public Estante() {
        this.balones = new ArrayList<>();
    }

    public List<Balon> getBalones() {
        return balones;
    }

    public void setBalones(List<Balon> balones) {
        this.balones = balones;
    }
}
