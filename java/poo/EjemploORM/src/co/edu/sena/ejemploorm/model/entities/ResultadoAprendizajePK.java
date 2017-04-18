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
public class ResultadoAprendizajePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "Programa_has_Competencia_Programa_Codigo")
    private String programahasCompetenciaProgramaCodigo;
    @Basic(optional = false)
    @Column(name = "Programa_has_Competencia_Competencia_Codigo")
    private String programahasCompetenciaCompetenciaCodigo;

    public ResultadoAprendizajePK() {
    }

    public ResultadoAprendizajePK(String codigo, String programahasCompetenciaProgramaCodigo, String programahasCompetenciaCompetenciaCodigo) {
        this.codigo = codigo;
        this.programahasCompetenciaProgramaCodigo = programahasCompetenciaProgramaCodigo;
        this.programahasCompetenciaCompetenciaCodigo = programahasCompetenciaCompetenciaCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProgramahasCompetenciaProgramaCodigo() {
        return programahasCompetenciaProgramaCodigo;
    }

    public void setProgramahasCompetenciaProgramaCodigo(String programahasCompetenciaProgramaCodigo) {
        this.programahasCompetenciaProgramaCodigo = programahasCompetenciaProgramaCodigo;
    }

    public String getProgramahasCompetenciaCompetenciaCodigo() {
        return programahasCompetenciaCompetenciaCodigo;
    }

    public void setProgramahasCompetenciaCompetenciaCodigo(String programahasCompetenciaCompetenciaCodigo) {
        this.programahasCompetenciaCompetenciaCodigo = programahasCompetenciaCompetenciaCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (programahasCompetenciaProgramaCodigo != null ? programahasCompetenciaProgramaCodigo.hashCode() : 0);
        hash += (programahasCompetenciaCompetenciaCodigo != null ? programahasCompetenciaCompetenciaCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadoAprendizajePK)) {
            return false;
        }
        ResultadoAprendizajePK other = (ResultadoAprendizajePK) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if ((this.programahasCompetenciaProgramaCodigo == null && other.programahasCompetenciaProgramaCodigo != null) || (this.programahasCompetenciaProgramaCodigo != null && !this.programahasCompetenciaProgramaCodigo.equals(other.programahasCompetenciaProgramaCodigo))) {
            return false;
        }
        if ((this.programahasCompetenciaCompetenciaCodigo == null && other.programahasCompetenciaCompetenciaCodigo != null) || (this.programahasCompetenciaCompetenciaCodigo != null && !this.programahasCompetenciaCompetenciaCodigo.equals(other.programahasCompetenciaCompetenciaCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.ResultadoAprendizajePK[ codigo=" + codigo + ", programahasCompetenciaProgramaCodigo=" + programahasCompetenciaProgramaCodigo + ", programahasCompetenciaCompetenciaCodigo=" + programahasCompetenciaCompetenciaCodigo + " ]";
    }
    
}
