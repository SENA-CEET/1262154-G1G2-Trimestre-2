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
public class FichaHasTrimestrePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Ficha_numero_Ficha")
    private String fichanumeroFicha;
    @Basic(optional = false)
    @Column(name = "Trimestre_nombre_Trimestre")
    private String trimestrenombreTrimestre;
    @Basic(optional = false)
    @Column(name = "Trimestre_Jornada_sigla_Jornada")
    private String trimestreJornadasiglaJornada;

    public FichaHasTrimestrePK() {
    }

    public FichaHasTrimestrePK(String fichanumeroFicha, String trimestrenombreTrimestre, String trimestreJornadasiglaJornada) {
        this.fichanumeroFicha = fichanumeroFicha;
        this.trimestrenombreTrimestre = trimestrenombreTrimestre;
        this.trimestreJornadasiglaJornada = trimestreJornadasiglaJornada;
    }

    public String getFichanumeroFicha() {
        return fichanumeroFicha;
    }

    public void setFichanumeroFicha(String fichanumeroFicha) {
        this.fichanumeroFicha = fichanumeroFicha;
    }

    public String getTrimestrenombreTrimestre() {
        return trimestrenombreTrimestre;
    }

    public void setTrimestrenombreTrimestre(String trimestrenombreTrimestre) {
        this.trimestrenombreTrimestre = trimestrenombreTrimestre;
    }

    public String getTrimestreJornadasiglaJornada() {
        return trimestreJornadasiglaJornada;
    }

    public void setTrimestreJornadasiglaJornada(String trimestreJornadasiglaJornada) {
        this.trimestreJornadasiglaJornada = trimestreJornadasiglaJornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fichanumeroFicha != null ? fichanumeroFicha.hashCode() : 0);
        hash += (trimestrenombreTrimestre != null ? trimestrenombreTrimestre.hashCode() : 0);
        hash += (trimestreJornadasiglaJornada != null ? trimestreJornadasiglaJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FichaHasTrimestrePK)) {
            return false;
        }
        FichaHasTrimestrePK other = (FichaHasTrimestrePK) object;
        if ((this.fichanumeroFicha == null && other.fichanumeroFicha != null) || (this.fichanumeroFicha != null && !this.fichanumeroFicha.equals(other.fichanumeroFicha))) {
            return false;
        }
        if ((this.trimestrenombreTrimestre == null && other.trimestrenombreTrimestre != null) || (this.trimestrenombreTrimestre != null && !this.trimestrenombreTrimestre.equals(other.trimestrenombreTrimestre))) {
            return false;
        }
        if ((this.trimestreJornadasiglaJornada == null && other.trimestreJornadasiglaJornada != null) || (this.trimestreJornadasiglaJornada != null && !this.trimestreJornadasiglaJornada.equals(other.trimestreJornadasiglaJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.FichaHasTrimestrePK[ fichanumeroFicha=" + fichanumeroFicha + ", trimestrenombreTrimestre=" + trimestrenombreTrimestre + ", trimestreJornadasiglaJornada=" + trimestreJornadasiglaJornada + " ]";
    }
    
}
