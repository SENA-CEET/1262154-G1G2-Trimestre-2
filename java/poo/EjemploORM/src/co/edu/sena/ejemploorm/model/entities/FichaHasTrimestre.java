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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "ficha_has_trimestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FichaHasTrimestre.findAll", query = "SELECT f FROM FichaHasTrimestre f")
    , @NamedQuery(name = "FichaHasTrimestre.findByFichanumeroFicha", query = "SELECT f FROM FichaHasTrimestre f WHERE f.fichaHasTrimestrePK.fichanumeroFicha = :fichanumeroFicha")
    , @NamedQuery(name = "FichaHasTrimestre.findByTrimestrenombreTrimestre", query = "SELECT f FROM FichaHasTrimestre f WHERE f.fichaHasTrimestrePK.trimestrenombreTrimestre = :trimestrenombreTrimestre")
    , @NamedQuery(name = "FichaHasTrimestre.findByTrimestreJornadasiglaJornada", query = "SELECT f FROM FichaHasTrimestre f WHERE f.fichaHasTrimestrePK.trimestreJornadasiglaJornada = :trimestreJornadasiglaJornada")})
public class FichaHasTrimestre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FichaHasTrimestrePK fichaHasTrimestrePK;
    @JoinTable(name = "ficha_has_trimestre_has_resultado_aprendizaje", joinColumns = {
        @JoinColumn(name = "Ficha_numero_Ficha", referencedColumnName = "Ficha_numero_Ficha")
        , @JoinColumn(name = "Trimestre_nombre_Trimestre", referencedColumnName = "Trimestre_nombre_Trimestre")
        , @JoinColumn(name = "Jornada_sigla_Jornada", referencedColumnName = "Trimestre_Jornada_sigla_Jornada")}, inverseJoinColumns = {
        @JoinColumn(name = "Resultado_Aprendizaje_Codigo", referencedColumnName = "Codigo")
        , @JoinColumn(name = "Programa_Codigo", referencedColumnName = "Programa_has_Competencia_Programa_Codigo")
        , @JoinColumn(name = "Competencia_Codigo", referencedColumnName = "Programa_has_Competencia_Competencia_Codigo")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<ResultadoAprendizaje> resultadoAprendizajeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fichaHasTrimestre", fetch = FetchType.EAGER)
    private List<Horario> horarioList;
    @JoinColumn(name = "Ficha_numero_Ficha", referencedColumnName = "numero_Ficha", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Ficha ficha;
    @JoinColumns({
        @JoinColumn(name = "Trimestre_nombre_Trimestre", referencedColumnName = "nombre_Trimestre", insertable = false, updatable = false)
        , @JoinColumn(name = "Trimestre_Jornada_sigla_Jornada", referencedColumnName = "Jornada_sigla_Jornada", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Trimestre trimestre;

    public FichaHasTrimestre() {
    }

    public FichaHasTrimestre(FichaHasTrimestrePK fichaHasTrimestrePK) {
        this.fichaHasTrimestrePK = fichaHasTrimestrePK;
    }

    public FichaHasTrimestre(String fichanumeroFicha, String trimestrenombreTrimestre, String trimestreJornadasiglaJornada) {
        this.fichaHasTrimestrePK = new FichaHasTrimestrePK(fichanumeroFicha, trimestrenombreTrimestre, trimestreJornadasiglaJornada);
    }

    public FichaHasTrimestrePK getFichaHasTrimestrePK() {
        return fichaHasTrimestrePK;
    }

    public void setFichaHasTrimestrePK(FichaHasTrimestrePK fichaHasTrimestrePK) {
        this.fichaHasTrimestrePK = fichaHasTrimestrePK;
    }

    @XmlTransient
    public List<ResultadoAprendizaje> getResultadoAprendizajeList() {
        return resultadoAprendizajeList;
    }

    public void setResultadoAprendizajeList(List<ResultadoAprendizaje> resultadoAprendizajeList) {
        this.resultadoAprendizajeList = resultadoAprendizajeList;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Trimestre getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(Trimestre trimestre) {
        this.trimestre = trimestre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fichaHasTrimestrePK != null ? fichaHasTrimestrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FichaHasTrimestre)) {
            return false;
        }
        FichaHasTrimestre other = (FichaHasTrimestre) object;
        if ((this.fichaHasTrimestrePK == null && other.fichaHasTrimestrePK != null) || (this.fichaHasTrimestrePK != null && !this.fichaHasTrimestrePK.equals(other.fichaHasTrimestrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.FichaHasTrimestre[ fichaHasTrimestrePK=" + fichaHasTrimestrePK + " ]";
    }
    
}
