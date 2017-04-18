/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "ficha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ficha.findAll", query = "SELECT f FROM Ficha f")
    , @NamedQuery(name = "Ficha.findByNumeroFicha", query = "SELECT f FROM Ficha f WHERE f.numeroFicha = :numeroFicha")
    , @NamedQuery(name = "Ficha.findByFechaInicio", query = "SELECT f FROM Ficha f WHERE f.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Ficha.findByFechaFin", query = "SELECT f FROM Ficha f WHERE f.fechaFin = :fechaFin")
    , @NamedQuery(name = "Ficha.findByRuta", query = "SELECT f FROM Ficha f WHERE f.ruta = :ruta")})
public class Ficha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero_Ficha")
    private String numeroFicha;
    @Basic(optional = false)
    @Column(name = "fecha_Inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_Fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "Ruta")
    private String ruta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ficha", fetch = FetchType.EAGER)
    private List<FichaHasTrimestre> fichaHasTrimestreList;
    @JoinColumn(name = "Estado_Ficha_nombre_Estado", referencedColumnName = "nombre_Estado")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EstadoFicha estadoFichanombreEstado;
    @JoinColumn(name = "Programa_Codigo", referencedColumnName = "Codigo")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Programa programaCodigo;

    public Ficha() {
    }

    public Ficha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public Ficha(String numeroFicha, Date fechaInicio, Date fechaFin, String ruta) {
        this.numeroFicha = numeroFicha;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ruta = ruta;
    }

    public String getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @XmlTransient
    public List<FichaHasTrimestre> getFichaHasTrimestreList() {
        return fichaHasTrimestreList;
    }

    public void setFichaHasTrimestreList(List<FichaHasTrimestre> fichaHasTrimestreList) {
        this.fichaHasTrimestreList = fichaHasTrimestreList;
    }

    public EstadoFicha getEstadoFichanombreEstado() {
        return estadoFichanombreEstado;
    }

    public void setEstadoFichanombreEstado(EstadoFicha estadoFichanombreEstado) {
        this.estadoFichanombreEstado = estadoFichanombreEstado;
    }

    public Programa getProgramaCodigo() {
        return programaCodigo;
    }

    public void setProgramaCodigo(Programa programaCodigo) {
        this.programaCodigo = programaCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroFicha != null ? numeroFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ficha)) {
            return false;
        }
        Ficha other = (Ficha) object;
        if ((this.numeroFicha == null && other.numeroFicha != null) || (this.numeroFicha != null && !this.numeroFicha.equals(other.numeroFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Ficha[ numeroFicha=" + numeroFicha + " ]";
    }
    
}
