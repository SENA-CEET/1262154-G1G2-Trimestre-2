package co.edu.sena.clasesrelaciones.asociacion.ejemplo7;

import java.util.List;

/**
 * Created by Enrique on 17/03/2017.
 */
public class Casa {
    private String matriculaInmobilaria;
    private String cedulaCatastral;
    private String direccion;
    private List<Persona> propietarios;

    public String getMatriculaInmobilaria() {
        return matriculaInmobilaria;
    }

    public void setMatriculaInmobilaria(String matriculaInmobilaria) {
        this.matriculaInmobilaria = matriculaInmobilaria;
    }

    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    public void setCedulaCatastral(String cedulaCatastral) {
        this.cedulaCatastral = cedulaCatastral;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Persona> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Persona> propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Casa casa = (Casa) o;

        return matriculaInmobilaria.equals(casa.matriculaInmobilaria);
    }

    @Override
    public int hashCode() {
        return matriculaInmobilaria.hashCode();
    }

    @Override
    public String toString() {
        return "Casa{" +
                "matriculaInmobilaria='" + matriculaInmobilaria + '\'' +
                ", cedulaCatastral='" + cedulaCatastral + '\'' +
                ", direccion='" + direccion + '\'' +
                ", propietarios=" + propietarios +
                '}';
    }
}
