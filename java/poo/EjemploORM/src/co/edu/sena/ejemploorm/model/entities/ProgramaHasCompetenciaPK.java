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
public class ProgramaHasCompetenciaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Programa_Codigo")
    private String programaCodigo;
    @Basic(optional = false)
    @Column(name = "Competencia_Codigo")
    private String competenciaCodigo;

    public ProgramaHasCompetenciaPK() {
    }

    public ProgramaHasCompetenciaPK(String programaCodigo, String competenciaCodigo) {
        this.programaCodigo = programaCodigo;
        this.competenciaCodigo = competenciaCodigo;
    }

    public String getProgramaCodigo() {
        return programaCodigo;
    }

    public void setProgramaCodigo(String programaCodigo) {
        this.programaCodigo = programaCodigo;
    }

    public String getCompetenciaCodigo() {
        return competenciaCodigo;
    }

    public void setCompetenciaCodigo(String competenciaCodigo) {
        this.competenciaCodigo = competenciaCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaCodigo != null ? programaCodigo.hashCode() : 0);
        hash += (competenciaCodigo != null ? competenciaCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaHasCompetenciaPK)) {
            return false;
        }
        ProgramaHasCompetenciaPK other = (ProgramaHasCompetenciaPK) object;
        if ((this.programaCodigo == null && other.programaCodigo != null) || (this.programaCodigo != null && !this.programaCodigo.equals(other.programaCodigo))) {
            return false;
        }
        if ((this.competenciaCodigo == null && other.competenciaCodigo != null) || (this.competenciaCodigo != null && !this.competenciaCodigo.equals(other.competenciaCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.ProgramaHasCompetenciaPK[ programaCodigo=" + programaCodigo + ", competenciaCodigo=" + competenciaCodigo + " ]";
    }
    
}
