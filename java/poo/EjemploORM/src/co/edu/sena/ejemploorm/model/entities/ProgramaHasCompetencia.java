/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "programa_has_competencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProgramaHasCompetencia.findAll", query = "SELECT p FROM ProgramaHasCompetencia p")
    , @NamedQuery(name = "ProgramaHasCompetencia.findByProgramaCodigo", query = "SELECT p FROM ProgramaHasCompetencia p WHERE p.programaHasCompetenciaPK.programaCodigo = :programaCodigo")
    , @NamedQuery(name = "ProgramaHasCompetencia.findByCompetenciaCodigo", query = "SELECT p FROM ProgramaHasCompetencia p WHERE p.programaHasCompetenciaPK.competenciaCodigo = :competenciaCodigo")})
public class ProgramaHasCompetencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProgramaHasCompetenciaPK programaHasCompetenciaPK;
    @JoinColumn(name = "Competencia_Codigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Competencia competencia;
    @JoinColumn(name = "Programa_Codigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Programa programa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programaHasCompetencia", fetch = FetchType.EAGER)
    private List<ResultadoAprendizaje> resultadoAprendizajeList;

    public ProgramaHasCompetencia() {
    }

    public ProgramaHasCompetencia(ProgramaHasCompetenciaPK programaHasCompetenciaPK) {
        this.programaHasCompetenciaPK = programaHasCompetenciaPK;
    }

    public ProgramaHasCompetencia(String programaCodigo, String competenciaCodigo) {
        this.programaHasCompetenciaPK = new ProgramaHasCompetenciaPK(programaCodigo, competenciaCodigo);
    }

    public ProgramaHasCompetenciaPK getProgramaHasCompetenciaPK() {
        return programaHasCompetenciaPK;
    }

    public void setProgramaHasCompetenciaPK(ProgramaHasCompetenciaPK programaHasCompetenciaPK) {
        this.programaHasCompetenciaPK = programaHasCompetenciaPK;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @XmlTransient
    public List<ResultadoAprendizaje> getResultadoAprendizajeList() {
        return resultadoAprendizajeList;
    }

    public void setResultadoAprendizajeList(List<ResultadoAprendizaje> resultadoAprendizajeList) {
        this.resultadoAprendizajeList = resultadoAprendizajeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaHasCompetenciaPK != null ? programaHasCompetenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaHasCompetencia)) {
            return false;
        }
        ProgramaHasCompetencia other = (ProgramaHasCompetencia) object;
        if ((this.programaHasCompetenciaPK == null && other.programaHasCompetenciaPK != null) || (this.programaHasCompetenciaPK != null && !this.programaHasCompetenciaPK.equals(other.programaHasCompetenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.ProgramaHasCompetencia[ programaHasCompetenciaPK=" + programaHasCompetenciaPK + " ]";
    }
    
}
