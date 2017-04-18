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
@Table(name = "vinculacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vinculacion.findAll", query = "SELECT v FROM Vinculacion v")
    , @NamedQuery(name = "Vinculacion.findByTipoVinculacion", query = "SELECT v FROM Vinculacion v WHERE v.tipoVinculacion = :tipoVinculacion")
    , @NamedQuery(name = "Vinculacion.findByHoras", query = "SELECT v FROM Vinculacion v WHERE v.horas = :horas")
    , @NamedQuery(name = "Vinculacion.findByEstado", query = "SELECT v FROM Vinculacion v WHERE v.estado = :estado")})
public class Vinculacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "tipo_Vinculacion")
    private String tipoVinculacion;
    @Basic(optional = false)
    @Column(name = "Horas")
    private int horas;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vinculaciontipoVinculacion", fetch = FetchType.EAGER)
    private List<Instructor> instructorList;

    public Vinculacion() {
    }

    public Vinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }

    public Vinculacion(String tipoVinculacion, int horas, int estado) {
        this.tipoVinculacion = tipoVinculacion;
        this.horas = horas;
        this.estado = estado;
    }

    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    public void setTipoVinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoVinculacion != null ? tipoVinculacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vinculacion)) {
            return false;
        }
        Vinculacion other = (Vinculacion) object;
        if ((this.tipoVinculacion == null && other.tipoVinculacion != null) || (this.tipoVinculacion != null && !this.tipoVinculacion.equals(other.tipoVinculacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Vinculacion[ tipoVinculacion=" + tipoVinculacion + " ]";
    }
    
}
