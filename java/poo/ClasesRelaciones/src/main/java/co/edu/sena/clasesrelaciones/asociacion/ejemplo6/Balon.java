package co.edu.sena.clasesrelaciones.asociacion.ejemplo6;

import java.util.Objects;

/**
 * Created by Enrique on 16/03/2017.
 */
public class Balon {
    private int numero;

    public Balon(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {

        boolean r = false;
        if(obj instanceof Balon){
           Balon bt = (Balon)obj;
           if(this.numero == bt.getNumero()){
               r= true;

           }
       }
        return r;
    }

    @Override
    public int hashCode() {
        int hash =4;
        hash = 45 * hash + Objects.hashCode(this.numero);
        return super.hashCode();
    }
}
