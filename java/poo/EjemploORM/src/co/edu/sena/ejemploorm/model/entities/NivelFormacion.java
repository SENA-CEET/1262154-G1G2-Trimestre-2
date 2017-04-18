/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "nivel_formacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelFormacion.findAll", query = "SELECT n FROM NivelFormacion n")
    , @NamedQuery(name = "NivelFormacion.findByNivelFormacion", query = "SELECT n FROM NivelFormacion n WHERE n.nivelFormacion = :nivelFormacion")
    , @NamedQuery(name = "NivelFormacion.findByEstado", query = "SELECT n FROM NivelFormacion n WHERE n.estado = :estado")})
public class NivelFormacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nivel_Formacion")
    private String nivelFormacion;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nivelFormacionnivelFormacion", fetch = FetchType.EAGER)
    private List<Programa> programaList;

    public NivelFormacion() {
    }

    public NivelFormacion(String nivelFormacion) {
        this.nivelFormacion = nivelFormacion;
    }

    public NivelFormacion(String nivelFormacion, int estado) {
        this.nivelFormacion = nivelFormacion;
        this.estado = estado;
    }

    public String getNivelFormacion() {
        return nivelFormacion;
    }

    public void setNivelFormacion(String nivelFormacion) {
        this.nivelFormacion = nivelFormacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Programa> getProgramaList() {
        return programaList;
    }

    public void setProgramaList(List<Programa> programaList) {
        this.programaList = programaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nivelFormacion != null ? nivelFormacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelFormacion)) {
            return false;
        }
        NivelFormacion other = (NivelFormacion) object;
        if ((this.nivelFormacion == null && other.nivelFormacion != null) || (this.nivelFormacion != null && !this.nivelFormacion.equals(other.nivelFormacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.NivelFormacion[ nivelFormacion=" + nivelFormacion + " ]";
    }
    
}
