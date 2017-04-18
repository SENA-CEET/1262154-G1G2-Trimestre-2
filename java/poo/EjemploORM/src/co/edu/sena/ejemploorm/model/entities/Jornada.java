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
import javax.persistence.Lob;
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
@Table(name = "jornada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jornada.findAll", query = "SELECT j FROM Jornada j")
    , @NamedQuery(name = "Jornada.findBySiglaJornada", query = "SELECT j FROM Jornada j WHERE j.siglaJornada = :siglaJornada")
    , @NamedQuery(name = "Jornada.findByNombre", query = "SELECT j FROM Jornada j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jornada.findByDescripcion", query = "SELECT j FROM Jornada j WHERE j.descripcion = :descripcion")
    , @NamedQuery(name = "Jornada.findByEstado", query = "SELECT j FROM Jornada j WHERE j.estado = :estado")})
public class Jornada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sigla_Jornada")
    private String siglaJornada;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Lob
    @Column(name = "Imagen")
    private byte[] imagen;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jornada", fetch = FetchType.EAGER)
    private List<Trimestre> trimestreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jornada", fetch = FetchType.EAGER)
    private List<Disponibilidad> disponibilidadList;

    public Jornada() {
    }

    public Jornada(String siglaJornada) {
        this.siglaJornada = siglaJornada;
    }

    public Jornada(String siglaJornada, String nombre) {
        this.siglaJornada = siglaJornada;
        this.nombre = nombre;
    }

    public String getSiglaJornada() {
        return siglaJornada;
    }

    public void setSiglaJornada(String siglaJornada) {
        this.siglaJornada = siglaJornada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Trimestre> getTrimestreList() {
        return trimestreList;
    }

    public void setTrimestreList(List<Trimestre> trimestreList) {
        this.trimestreList = trimestreList;
    }

    @XmlTransient
    public List<Disponibilidad> getDisponibilidadList() {
        return disponibilidadList;
    }

    public void setDisponibilidadList(List<Disponibilidad> disponibilidadList) {
        this.disponibilidadList = disponibilidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siglaJornada != null ? siglaJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jornada)) {
            return false;
        }
        Jornada other = (Jornada) object;
        if ((this.siglaJornada == null && other.siglaJornada != null) || (this.siglaJornada != null && !this.siglaJornada.equals(other.siglaJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Jornada[ siglaJornada=" + siglaJornada + " ]";
    }
    
}
