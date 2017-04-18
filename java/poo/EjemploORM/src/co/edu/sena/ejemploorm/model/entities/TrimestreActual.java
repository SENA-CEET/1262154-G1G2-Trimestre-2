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
@Table(name = "trimestre_actual")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrimestreActual.findAll", query = "SELECT t FROM TrimestreActual t")
    , @NamedQuery(name = "TrimestreActual.findByIdTrimestreActual", query = "SELECT t FROM TrimestreActual t WHERE t.idTrimestreActual = :idTrimestreActual")
    , @NamedQuery(name = "TrimestreActual.findByFechaInicio", query = "SELECT t FROM TrimestreActual t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "TrimestreActual.findByFechaFin", query = "SELECT t FROM TrimestreActual t WHERE t.fechaFin = :fechaFin")})
public class TrimestreActual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTrimestre_Actual")
    private String idTrimestreActual;
    @Basic(optional = false)
    @Column(name = "Fecha_Inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "Fecha_Fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trimestreActualidTrimestreActual", fetch = FetchType.EAGER)
    private List<Horario> horarioList;

    public TrimestreActual() {
    }

    public TrimestreActual(String idTrimestreActual) {
        this.idTrimestreActual = idTrimestreActual;
    }

    public TrimestreActual(String idTrimestreActual, Date fechaInicio, Date fechaFin) {
        this.idTrimestreActual = idTrimestreActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getIdTrimestreActual() {
        return idTrimestreActual;
    }

    public void setIdTrimestreActual(String idTrimestreActual) {
        this.idTrimestreActual = idTrimestreActual;
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

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrimestreActual != null ? idTrimestreActual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrimestreActual)) {
            return false;
        }
        TrimestreActual other = (TrimestreActual) object;
        if ((this.idTrimestreActual == null && other.idTrimestreActual != null) || (this.idTrimestreActual != null && !this.idTrimestreActual.equals(other.idTrimestreActual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.TrimestreActual[ idTrimestreActual=" + idTrimestreActual + " ]";
    }
    
}
