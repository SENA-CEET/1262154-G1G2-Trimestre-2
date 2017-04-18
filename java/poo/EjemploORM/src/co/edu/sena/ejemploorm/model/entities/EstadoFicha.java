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
@Table(name = "estado_ficha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoFicha.findAll", query = "SELECT e FROM EstadoFicha e")
    , @NamedQuery(name = "EstadoFicha.findByNombreEstado", query = "SELECT e FROM EstadoFicha e WHERE e.nombreEstado = :nombreEstado")
    , @NamedQuery(name = "EstadoFicha.findByEstado", query = "SELECT e FROM EstadoFicha e WHERE e.estado = :estado")})
public class EstadoFicha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre_Estado")
    private String nombreEstado;
    @Basic(optional = false)
    @Column(name = "Estado")
    private short estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoFichanombreEstado", fetch = FetchType.EAGER)
    private List<Ficha> fichaList;

    public EstadoFicha() {
    }

    public EstadoFicha(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public EstadoFicha(String nombreEstado, short estado) {
        this.nombreEstado = nombreEstado;
        this.estado = estado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Ficha> getFichaList() {
        return fichaList;
    }

    public void setFichaList(List<Ficha> fichaList) {
        this.fichaList = fichaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreEstado != null ? nombreEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoFicha)) {
            return false;
        }
        EstadoFicha other = (EstadoFicha) object;
        if ((this.nombreEstado == null && other.nombreEstado != null) || (this.nombreEstado != null && !this.nombreEstado.equals(other.nombreEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.EstadoFicha[ nombreEstado=" + nombreEstado + " ]";
    }
    
}
