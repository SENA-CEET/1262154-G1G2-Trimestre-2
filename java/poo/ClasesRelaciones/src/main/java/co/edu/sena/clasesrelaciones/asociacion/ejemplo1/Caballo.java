package co.edu.sena.clasesrelaciones.asociacion.ejemplo1;

/**
 * Created by Enrique on 13/03/2017.
 */
public class Caballo {

   private Ojo ojoIzquierdo;
   private Ojo ojoDerecho;
   private Corazon corazon;
   private Rinion rinionIzquierdo;
   private Rinion rinionDerecho;

    public Caballo(Ojo ojoIzquierdo, Ojo ojoDerecho, Rinion rinionIzquierdo, Rinion rinionDerecho, Corazon corazon ) {
        this.ojoIzquierdo = ojoIzquierdo;
        this.ojoDerecho = ojoDerecho;
        this.rinionDerecho = rinionDerecho;
        this.rinionIzquierdo = rinionIzquierdo;
        this.corazon = corazon;
    }

    public Ojo getOjoIzquierdo() {
        return ojoIzquierdo;
    }

    public void setOjoIzquierdo(Ojo ojoIzquierdo) {
        this.ojoIzquierdo = ojoIzquierdo;
    }

    public Ojo getOjoDerecho() {
        return ojoDerecho;
    }

    public void setOjoDerecho(Ojo ojoDerecho) {
        this.ojoDerecho = ojoDerecho;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Rinion getRinionIzquierdo() {
        return rinionIzquierdo;
    }

    public void setRinionIzquierdo(Rinion rinionIzquierdo) {
        this.rinionIzquierdo = rinionIzquierdo;
    }

    public Rinion getRinionDerecho() {
        return rinionDerecho;
    }

    public void setRinionDerecho(Rinion rinionDerecho) {
        this.rinionDerecho = rinionDerecho;
    }
}
