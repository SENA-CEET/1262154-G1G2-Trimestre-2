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
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdActividad", query = "SELECT a FROM Actividad a WHERE a.actividadPK.idActividad = :idActividad")
    , @NamedQuery(name = "Actividad.findByNombre", query = "SELECT a FROM Actividad a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Actividad.findByFasenombreFase", query = "SELECT a FROM Actividad a WHERE a.actividadPK.fasenombreFase = :fasenombreFase")
    , @NamedQuery(name = "Actividad.findByFaseProyectoCodigo", query = "SELECT a FROM Actividad a WHERE a.actividadPK.faseProyectoCodigo = :faseProyectoCodigo")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActividadPK actividadPK;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @JoinTable(name = "resultado_aprendizaje_has_actividad", joinColumns = {
        @JoinColumn(name = "Actividad_id_Actividad", referencedColumnName = "id_Actividad")
        , @JoinColumn(name = "Fase_nombre_Fase", referencedColumnName = "Fase_nombre_Fase")
        , @JoinColumn(name = "Fase_Proyecto_Codigo", referencedColumnName = "Fase_Proyecto_Codigo")}, inverseJoinColumns = {
        @JoinColumn(name = "Resultado_Aprendizaje_Codigo", referencedColumnName = "Codigo")
        , @JoinColumn(name = "Programa_Codigo", referencedColumnName = "Programa_has_Competencia_Programa_Codigo")
        , @JoinColumn(name = "Competencia_Codigo", referencedColumnName = "Programa_has_Competencia_Competencia_Codigo")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<ResultadoAprendizaje> resultadoAprendizajeList;
    @JoinColumns({
        @JoinColumn(name = "Fase_nombre_Fase", referencedColumnName = "nombre_Fase", insertable = false, updatable = false)
        , @JoinColumn(name = "Fase_Proyecto_Codigo", referencedColumnName = "Proyecto_Codigo", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Fase fase;

    public Actividad() {
    }

    public Actividad(ActividadPK actividadPK) {
        this.actividadPK = actividadPK;
    }

    public Actividad(ActividadPK actividadPK, String nombre) {
        this.actividadPK = actividadPK;
        this.nombre = nombre;
    }

    public Actividad(int idActividad, String fasenombreFase, String faseProyectoCodigo) {
        this.actividadPK = new ActividadPK(idActividad, fasenombreFase, faseProyectoCodigo);
    }

    public ActividadPK getActividadPK() {
        return actividadPK;
    }

    public void setActividadPK(ActividadPK actividadPK) {
        this.actividadPK = actividadPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<ResultadoAprendizaje> getResultadoAprendizajeList() {
        return resultadoAprendizajeList;
    }

    public void setResultadoAprendizajeList(List<ResultadoAprendizaje> resultadoAprendizajeList) {
        this.resultadoAprendizajeList = resultadoAprendizajeList;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividadPK != null ? actividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.actividadPK == null && other.actividadPK != null) || (this.actividadPK != null && !this.actividadPK.equals(other.actividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Actividad[ actividadPK=" + actividadPK + " ]";
    }
    
}
