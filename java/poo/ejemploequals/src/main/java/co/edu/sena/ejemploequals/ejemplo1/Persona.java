package co.edu.sena.ejemploequals.ejemplo1;

import javax.management.Query;

/**
 * Created by Enrique on 16/03/2017.
 */
public class Persona {

    private String tipoDocumento;
    private String numeroDocumento;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String segundoNombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Override
    public boolean equals(Object obj) {
        boolean retorno = false;
        if(obj instanceof Persona) {
            Persona pt = (Persona) obj;
            if (this.getTipoDocumento().equals(pt.getTipoDocumento()) &&
                    this.getNumeroDocumento().equals(pt.getNumeroDocumento())) {
                retorno = true;
            }
        }
        return retorno;
    }

    @Override
    public int hashCode() {
        int hash =27;
        hash = 40 * hash + this.getTipoDocumento().hashCode();
        hash = 40 * hash + this.getNumeroDocumento().hashCode();

        return hash;

    }
}
