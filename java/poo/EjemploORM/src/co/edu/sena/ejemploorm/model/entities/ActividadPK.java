/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Enrique
 */
@Embeddable
public class ActividadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_Actividad")
    private int idActividad;
    @Basic(optional = false)
    @Column(name = "Fase_nombre_Fase")
    private String fasenombreFase;
    @Basic(optional = false)
    @Column(name = "Fase_Proyecto_Codigo")
    private String faseProyectoCodigo;

    public ActividadPK() {
    }

    public ActividadPK(int idActividad, String fasenombreFase, String faseProyectoCodigo) {
        this.idActividad = idActividad;
        this.fasenombreFase = fasenombreFase;
        this.faseProyectoCodigo = faseProyectoCodigo;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getFasenombreFase() {
        return fasenombreFase;
    }

    public void setFasenombreFase(String fasenombreFase) {
        this.fasenombreFase = fasenombreFase;
    }

    public String getFaseProyectoCodigo() {
        return faseProyectoCodigo;
    }

    public void setFaseProyectoCodigo(String faseProyectoCodigo) {
        this.faseProyectoCodigo = faseProyectoCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idActividad;
        hash += (fasenombreFase != null ? fasenombreFase.hashCode() : 0);
        hash += (faseProyectoCodigo != null ? faseProyectoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadPK)) {
            return false;
        }
        ActividadPK other = (ActividadPK) object;
        if (this.idActividad != other.idActividad) {
            return false;
        }
        if ((this.fasenombreFase == null && other.fasenombreFase != null) || (this.fasenombreFase != null && !this.fasenombreFase.equals(other.fasenombreFase))) {
            return false;
        }
        if ((this.faseProyectoCodigo == null && other.faseProyectoCodigo != null) || (this.faseProyectoCodigo != null && !this.faseProyectoCodigo.equals(other.faseProyectoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.ActividadPK[ idActividad=" + idActividad + ", fasenombreFase=" + fasenombreFase + ", faseProyectoCodigo=" + faseProyectoCodigo + " ]";
    }
    
}
