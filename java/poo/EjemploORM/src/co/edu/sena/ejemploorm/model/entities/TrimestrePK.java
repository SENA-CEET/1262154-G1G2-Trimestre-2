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
public class TrimestrePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "nombre_Trimestre")
    private String nombreTrimestre;
    @Basic(optional = false)
    @Column(name = "Jornada_sigla_Jornada")
    private String jornadasiglaJornada;

    public TrimestrePK() {
    }

    public TrimestrePK(String nombreTrimestre, String jornadasiglaJornada) {
        this.nombreTrimestre = nombreTrimestre;
        this.jornadasiglaJornada = jornadasiglaJornada;
    }

    public String getNombreTrimestre() {
        return nombreTrimestre;
    }

    public void setNombreTrimestre(String nombreTrimestre) {
        this.nombreTrimestre = nombreTrimestre;
    }

    public String getJornadasiglaJornada() {
        return jornadasiglaJornada;
    }

    public void setJornadasiglaJornada(String jornadasiglaJornada) {
        this.jornadasiglaJornada = jornadasiglaJornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreTrimestre != null ? nombreTrimestre.hashCode() : 0);
        hash += (jornadasiglaJornada != null ? jornadasiglaJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrimestrePK)) {
            return false;
        }
        TrimestrePK other = (TrimestrePK) object;
        if ((this.nombreTrimestre == null && other.nombreTrimestre != null) || (this.nombreTrimestre != null && !this.nombreTrimestre.equals(other.nombreTrimestre))) {
            return false;
        }
        if ((this.jornadasiglaJornada == null && other.jornadasiglaJornada != null) || (this.jornadasiglaJornada != null && !this.jornadasiglaJornada.equals(other.jornadasiglaJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.TrimestrePK[ nombreTrimestre=" + nombreTrimestre + ", jornadasiglaJornada=" + jornadasiglaJornada + " ]";
    }
    
}
