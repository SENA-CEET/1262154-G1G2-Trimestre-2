/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "fase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fase.findAll", query = "SELECT f FROM Fase f")
    , @NamedQuery(name = "Fase.findByNombreFase", query = "SELECT f FROM Fase f WHERE f.fasePK.nombreFase = :nombreFase")
    , @NamedQuery(name = "Fase.findByEstado", query = "SELECT f FROM Fase f WHERE f.estado = :estado")
    , @NamedQuery(name = "Fase.findByProyectoCodigo", query = "SELECT f FROM Fase f WHERE f.fasePK.proyectoCodigo = :proyectoCodigo")})
public class Fase implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FasePK fasePK;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fase", fetch = FetchType.EAGER)
    private List<Actividad> actividadList;
    @JoinColumn(name = "Proyecto_Codigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Proyecto proyecto;

    public Fase() {
    }

    public Fase(FasePK fasePK) {
        this.fasePK = fasePK;
    }

    public Fase(String nombreFase, String proyectoCodigo) {
        this.fasePK = new FasePK(nombreFase, proyectoCodigo);
    }

    public FasePK getFasePK() {
        return fasePK;
    }

    public void setFasePK(FasePK fasePK) {
        this.fasePK = fasePK;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {
        this.actividadList = actividadList;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fasePK != null ? fasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fase)) {
            return false;
        }
        Fase other = (Fase) object;
        if ((this.fasePK == null && other.fasePK != null) || (this.fasePK != null && !this.fasePK.equals(other.fasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Fase[ fasePK=" + fasePK + " ]";
    }
    
}
