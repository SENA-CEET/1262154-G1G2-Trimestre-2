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
public class AmbientePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "numero_Ambiente")
    private String numeroAmbiente;
    @Basic(optional = false)
    @Column(name = "Sede_nombre_Sede")
    private String sedenombreSede;

    public AmbientePK() {
    }

    public AmbientePK(String numeroAmbiente, String sedenombreSede) {
        this.numeroAmbiente = numeroAmbiente;
        this.sedenombreSede = sedenombreSede;
    }

    public String getNumeroAmbiente() {
        return numeroAmbiente;
    }

    public void setNumeroAmbiente(String numeroAmbiente) {
        this.numeroAmbiente = numeroAmbiente;
    }

    public String getSedenombreSede() {
        return sedenombreSede;
    }

    public void setSedenombreSede(String sedenombreSede) {
        this.sedenombreSede = sedenombreSede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroAmbiente != null ? numeroAmbiente.hashCode() : 0);
        hash += (sedenombreSede != null ? sedenombreSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmbientePK)) {
            return false;
        }
        AmbientePK other = (AmbientePK) object;
        if ((this.numeroAmbiente == null && other.numeroAmbiente != null) || (this.numeroAmbiente != null && !this.numeroAmbiente.equals(other.numeroAmbiente))) {
            return false;
        }
        if ((this.sedenombreSede == null && other.sedenombreSede != null) || (this.sedenombreSede != null && !this.sedenombreSede.equals(other.sedenombreSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.AmbientePK[ numeroAmbiente=" + numeroAmbiente + ", sedenombreSede=" + sedenombreSede + " ]";
    }
    
}
