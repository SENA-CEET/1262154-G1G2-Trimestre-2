/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "disponibilidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disponibilidad.findAll", query = "SELECT d FROM Disponibilidad d")
    , @NamedQuery(name = "Disponibilidad.findByInstructorPersonanumeroDocumento", query = "SELECT d FROM Disponibilidad d WHERE d.disponibilidadPK.instructorPersonanumeroDocumento = :instructorPersonanumeroDocumento")
    , @NamedQuery(name = "Disponibilidad.findByInstructorPersonaDocumentoidDocumento", query = "SELECT d FROM Disponibilidad d WHERE d.disponibilidadPK.instructorPersonaDocumentoidDocumento = :instructorPersonaDocumentoidDocumento")
    , @NamedQuery(name = "Disponibilidad.findByHoraInicio", query = "SELECT d FROM Disponibilidad d WHERE d.disponibilidadPK.horaInicio = :horaInicio")
    , @NamedQuery(name = "Disponibilidad.findByHoraFin", query = "SELECT d FROM Disponibilidad d WHERE d.horaFin = :horaFin")
    , @NamedQuery(name = "Disponibilidad.findByJornadasiglaJornada", query = "SELECT d FROM Disponibilidad d WHERE d.disponibilidadPK.jornadasiglaJornada = :jornadasiglaJornada")
    , @NamedQuery(name = "Disponibilidad.findByDianombreDia", query = "SELECT d FROM Disponibilidad d WHERE d.disponibilidadPK.dianombreDia = :dianombreDia")})
public class Disponibilidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DisponibilidadPK disponibilidadPK;
    @Column(name = "Hora_Fin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;
    @JoinColumn(name = "Dia_nombre_Dia", referencedColumnName = "nombre_Dia", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Dia dia;
    @JoinColumns({
        @JoinColumn(name = "Instructor_Persona_numero_Documento", referencedColumnName = "Persona_numero_Documento", insertable = false, updatable = false)
        , @JoinColumn(name = "Instructor_Persona_Documento_id_Documento", referencedColumnName = "Persona_Documento_id_Documento", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Instructor instructor;
    @JoinColumn(name = "Jornada_sigla_Jornada", referencedColumnName = "sigla_Jornada", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Jornada jornada;

    public Disponibilidad() {
    }

    public Disponibilidad(DisponibilidadPK disponibilidadPK) {
        this.disponibilidadPK = disponibilidadPK;
    }

    public Disponibilidad(String instructorPersonanumeroDocumento, String instructorPersonaDocumentoidDocumento, Date horaInicio, String jornadasiglaJornada, String dianombreDia) {
        this.disponibilidadPK = new DisponibilidadPK(instructorPersonanumeroDocumento, instructorPersonaDocumentoidDocumento, horaInicio, jornadasiglaJornada, dianombreDia);
    }

    public DisponibilidadPK getDisponibilidadPK() {
        return disponibilidadPK;
    }

    public void setDisponibilidadPK(DisponibilidadPK disponibilidadPK) {
        this.disponibilidadPK = disponibilidadPK;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (disponibilidadPK != null ? disponibilidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disponibilidad)) {
            return false;
        }
        Disponibilidad other = (Disponibilidad) object;
        if ((this.disponibilidadPK == null && other.disponibilidadPK != null) || (this.disponibilidadPK != null && !this.disponibilidadPK.equals(other.disponibilidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Disponibilidad[ disponibilidadPK=" + disponibilidadPK + " ]";
    }
    
}
