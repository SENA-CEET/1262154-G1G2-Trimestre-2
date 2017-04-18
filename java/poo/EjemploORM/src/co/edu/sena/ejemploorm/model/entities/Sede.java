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
@Table(name = "sede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s")
    , @NamedQuery(name = "Sede.findByNombreSede", query = "SELECT s FROM Sede s WHERE s.nombreSede = :nombreSede")
    , @NamedQuery(name = "Sede.findByDireccion", query = "SELECT s FROM Sede s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "Sede.findByEstado", query = "SELECT s FROM Sede s WHERE s.estado = :estado")})
public class Sede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre_Sede")
    private String nombreSede;
    @Basic(optional = false)
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sede", fetch = FetchType.EAGER)
    private List<Ambiente> ambienteList;

    public Sede() {
    }

    public Sede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public Sede(String nombreSede, String direccion) {
        this.nombreSede = nombreSede;
        this.direccion = direccion;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Ambiente> getAmbienteList() {
        return ambienteList;
    }

    public void setAmbienteList(List<Ambiente> ambienteList) {
        this.ambienteList = ambienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreSede != null ? nombreSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.nombreSede == null && other.nombreSede != null) || (this.nombreSede != null && !this.nombreSede.equals(other.nombreSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Sede[ nombreSede=" + nombreSede + " ]";
    }
    
}
