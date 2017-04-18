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
@Table(name = "ambiente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ambiente.findAll", query = "SELECT a FROM Ambiente a")
    , @NamedQuery(name = "Ambiente.findByNumeroAmbiente", query = "SELECT a FROM Ambiente a WHERE a.ambientePK.numeroAmbiente = :numeroAmbiente")
    , @NamedQuery(name = "Ambiente.findByDescripcion", query = "SELECT a FROM Ambiente a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Ambiente.findByEstado", query = "SELECT a FROM Ambiente a WHERE a.estado = :estado")
    , @NamedQuery(name = "Ambiente.findBySedenombreSede", query = "SELECT a FROM Ambiente a WHERE a.ambientePK.sedenombreSede = :sedenombreSede")})
public class Ambiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AmbientePK ambientePK;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ambiente", fetch = FetchType.EAGER)
    private List<Horario> horarioList;
    @JoinColumn(name = "Sede_nombre_Sede", referencedColumnName = "nombre_Sede", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Sede sede;

    public Ambiente() {
    }

    public Ambiente(AmbientePK ambientePK) {
        this.ambientePK = ambientePK;
    }

    public Ambiente(String numeroAmbiente, String sedenombreSede) {
        this.ambientePK = new AmbientePK(numeroAmbiente, sedenombreSede);
    }

    public AmbientePK getAmbientePK() {
        return ambientePK;
    }

    public void setAmbientePK(AmbientePK ambientePK) {
        this.ambientePK = ambientePK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ambientePK != null ? ambientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ambiente)) {
            return false;
        }
        Ambiente other = (Ambiente) object;
        if ((this.ambientePK == null && other.ambientePK != null) || (this.ambientePK != null && !this.ambientePK.equals(other.ambientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Ambiente[ ambientePK=" + ambientePK + " ]";
    }
    
}
