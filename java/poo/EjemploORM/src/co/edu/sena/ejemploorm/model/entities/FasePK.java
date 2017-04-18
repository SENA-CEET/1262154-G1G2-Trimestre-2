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
public class FasePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "nombre_Fase")
    private String nombreFase;
    @Basic(optional = false)
    @Column(name = "Proyecto_Codigo")
    private String proyectoCodigo;

    public FasePK() {
    }

    public FasePK(String nombreFase, String proyectoCodigo) {
        this.nombreFase = nombreFase;
        this.proyectoCodigo = proyectoCodigo;
    }

    public String getNombreFase() {
        return nombreFase;
    }

    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }

    public String getProyectoCodigo() {
        return proyectoCodigo;
    }

    public void setProyectoCodigo(String proyectoCodigo) {
        this.proyectoCodigo = proyectoCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreFase != null ? nombreFase.hashCode() : 0);
        hash += (proyectoCodigo != null ? proyectoCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FasePK)) {
            return false;
        }
        FasePK other = (FasePK) object;
        if ((this.nombreFase == null && other.nombreFase != null) || (this.nombreFase != null && !this.nombreFase.equals(other.nombreFase))) {
            return false;
        }
        if ((this.proyectoCodigo == null && other.proyectoCodigo != null) || (this.proyectoCodigo != null && !this.proyectoCodigo.equals(other.proyectoCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.FasePK[ nombreFase=" + nombreFase + ", proyectoCodigo=" + proyectoCodigo + " ]";
    }
    
}
