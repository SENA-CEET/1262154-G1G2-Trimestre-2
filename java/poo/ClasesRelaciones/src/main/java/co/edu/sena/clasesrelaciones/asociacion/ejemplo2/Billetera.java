package co.edu.sena.clasesrelaciones.asociacion.ejemplo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enrique on 14/03/2017.
 */
public class Billetera {
    private Moneda moneda;
    private List<Billete> billetes = new ArrayList<>() ;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }
}
