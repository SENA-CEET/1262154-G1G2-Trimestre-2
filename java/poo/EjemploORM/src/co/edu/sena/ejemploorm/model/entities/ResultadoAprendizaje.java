/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "resultado_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResultadoAprendizaje.findAll", query = "SELECT r FROM ResultadoAprendizaje r")
    , @NamedQuery(name = "ResultadoAprendizaje.findByCodigo", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.resultadoAprendizajePK.codigo = :codigo")
    , @NamedQuery(name = "ResultadoAprendizaje.findByDescripcion", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "ResultadoAprendizaje.findByProgramahasCompetenciaProgramaCodigo", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.resultadoAprendizajePK.programahasCompetenciaProgramaCodigo = :programahasCompetenciaProgramaCodigo")
    , @NamedQuery(name = "ResultadoAprendizaje.findByProgramahasCompetenciaCompetenciaCodigo", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.resultadoAprendizajePK.programahasCompetenciaCompetenciaCodigo = :programahasCompetenciaCompetenciaCodigo")})
public class ResultadoAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultadoAprendizajePK resultadoAprendizajePK;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "resultadoAprendizajeList", fetch = FetchType.EAGER)
    private List<Actividad> actividadList;
    @ManyToMany(mappedBy = "resultadoAprendizajeList", fetch = FetchType.EAGER)
    private List<FichaHasTrimestre> fichaHasTrimestreList;
    @JoinTable(name = "trimestre_has_resultado_aprendizaje", joinColumns = {
        @JoinColumn(name = "Resultado_Aprendizaje_Codigo", referencedColumnName = "Codigo")
        , @JoinColumn(name = "Programa_Codigo", referencedColumnName = "Programa_has_Competencia_Programa_Codigo")
        , @JoinColumn(name = "Competencia_Codigo", referencedColumnName = "Programa_has_Competencia_Competencia_Codigo")}, inverseJoinColumns = {
        @JoinColumn(name = "Trimestre_nombre_Trimestre", referencedColumnName = "nombre_Trimestre")
        , @JoinColumn(name = "Trimestre_Jornada_sigla_Jornada", referencedColumnName = "Jornada_sigla_Jornada")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Trimestre> trimestreList;
    @JoinColumns({
        @JoinColumn(name = "Programa_has_Competencia_Programa_Codigo", referencedColumnName = "Programa_Codigo", insertable = false, updatable = false)
        , @JoinColumn(name = "Programa_has_Competencia_Competencia_Codigo", referencedColumnName = "Competencia_Codigo", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private ProgramaHasCompetencia programaHasCompetencia;

    public ResultadoAprendizaje() {
    }

    public ResultadoAprendizaje(ResultadoAprendizajePK resultadoAprendizajePK) {
        this.resultadoAprendizajePK = resultadoAprendizajePK;
    }

    public ResultadoAprendizaje(ResultadoAprendizajePK resultadoAprendizajePK, String descripcion) {
        this.resultadoAprendizajePK = resultadoAprendizajePK;
        this.descripcion = descripcion;
    }

    public ResultadoAprendizaje(String codigo, String programahasCompetenciaProgramaCodigo, String programahasCompetenciaCompetenciaCodigo) {
        this.resultadoAprendizajePK = new ResultadoAprendizajePK(codigo, programahasCompetenciaProgramaCodigo, programahasCompetenciaCompetenciaCodigo);
    }

    public ResultadoAprendizajePK getResultadoAprendizajePK() {
        return resultadoAprendizajePK;
    }

    public void setResultadoAprendizajePK(ResultadoAprendizajePK resultadoAprendizajePK) {
        this.resultadoAprendizajePK = resultadoAprendizajePK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {
        this.actividadList = actividadList;
    }

    @XmlTransient
    public List<FichaHasTrimestre> getFichaHasTrimestreList() {
        return fichaHasTrimestreList;
    }

    public void setFichaHasTrimestreList(List<FichaHasTrimestre> fichaHasTrimestreList) {
        this.fichaHasTrimestreList = fichaHasTrimestreList;
    }

    @XmlTransient
    public List<Trimestre> getTrimestreList() {
        return trimestreList;
    }

    public void setTrimestreList(List<Trimestre> trimestreList) {
        this.trimestreList = trimestreList;
    }

    public ProgramaHasCompetencia getProgramaHasCompetencia() {
        return programaHasCompetencia;
    }

    public void setProgramaHasCompetencia(ProgramaHasCompetencia programaHasCompetencia) {
        this.programaHasCompetencia = programaHasCompetencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultadoAprendizajePK != null ? resultadoAprendizajePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadoAprendizaje)) {
            return false;
        }
        ResultadoAprendizaje other = (ResultadoAprendizaje) object;
        if ((this.resultadoAprendizajePK == null && other.resultadoAprendizajePK != null) || (this.resultadoAprendizajePK != null && !this.resultadoAprendizajePK.equals(other.resultadoAprendizajePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.ResultadoAprendizaje[ resultadoAprendizajePK=" + resultadoAprendizajePK + " ]";
    }
    
}
