/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Enrique
 */
@Embeddable
public class DisponibilidadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Instructor_Persona_numero_Documento")
    private String instructorPersonanumeroDocumento;
    @Basic(optional = false)
    @Column(name = "Instructor_Persona_Documento_id_Documento")
    private String instructorPersonaDocumentoidDocumento;
    @Basic(optional = false)
    @Column(name = "Hora_Inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Basic(optional = false)
    @Column(name = "Jornada_sigla_Jornada")
    private String jornadasiglaJornada;
    @Basic(optional = false)
    @Column(name = "Dia_nombre_Dia")
    private String dianombreDia;

    public DisponibilidadPK() {
    }

    public DisponibilidadPK(String instructorPersonanumeroDocumento, String instructorPersonaDocumentoidDocumento, Date horaInicio, String jornadasiglaJornada, String dianombreDia) {
        this.instructorPersonanumeroDocumento = instructorPersonanumeroDocumento;
        this.instructorPersonaDocumentoidDocumento = instructorPersonaDocumentoidDocumento;
        this.horaInicio = horaInicio;
        this.jornadasiglaJornada = jornadasiglaJornada;
        this.dianombreDia = dianombreDia;
    }

    public String getInstructorPersonanumeroDocumento() {
        return instructorPersonanumeroDocumento;
    }

    public void setInstructorPersonanumeroDocumento(String instructorPersonanumeroDocumento) {
        this.instructorPersonanumeroDocumento = instructorPersonanumeroDocumento;
    }

    public String getInstructorPersonaDocumentoidDocumento() {
        return instructorPersonaDocumentoidDocumento;
    }

    public void setInstructorPersonaDocumentoidDocumento(String instructorPersonaDocumentoidDocumento) {
        this.instructorPersonaDocumentoidDocumento = instructorPersonaDocumentoidDocumento;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getJornadasiglaJornada() {
        return jornadasiglaJornada;
    }

    public void setJornadasiglaJornada(String jornadasiglaJornada) {
        this.jornadasiglaJornada = jornadasiglaJornada;
    }

    public String getDianombreDia() {
        return dianombreDia;
    }

    public void setDianombreDia(String dianombreDia) {
        this.dianombreDia = dianombreDia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instructorPersonanumeroDocumento != null ? instructorPersonanumeroDocumento.hashCode() : 0);
        hash += (instructorPersonaDocumentoidDocumento != null ? instructorPersonaDocumentoidDocumento.hashCode() : 0);
        hash += (horaInicio != null ? horaInicio.hashCode() : 0);
        hash += (jornadasiglaJornada != null ? jornadasiglaJornada.hashCode() : 0);
        hash += (dianombreDia != null ? dianombreDia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DisponibilidadPK)) {
            return false;
        }
        DisponibilidadPK other = (DisponibilidadPK) object;
        if ((this.instructorPersonanumeroDocumento == null && other.instructorPersonanumeroDocumento != null) || (this.instructorPersonanumeroDocumento != null && !this.instructorPersonanumeroDocumento.equals(other.instructorPersonanumeroDocumento))) {
            return false;
        }
        if ((this.instructorPersonaDocumentoidDocumento == null && other.instructorPersonaDocumentoidDocumento != null) || (this.instructorPersonaDocumentoidDocumento != null && !this.instructorPersonaDocumentoidDocumento.equals(other.instructorPersonaDocumentoidDocumento))) {
            return false;
        }
        if ((this.horaInicio == null && other.horaInicio != null) || (this.horaInicio != null && !this.horaInicio.equals(other.horaInicio))) {
            return false;
        }
        if ((this.jornadasiglaJornada == null && other.jornadasiglaJornada != null) || (this.jornadasiglaJornada != null && !this.jornadasiglaJornada.equals(other.jornadasiglaJornada))) {
            return false;
        }
        if ((this.dianombreDia == null && other.dianombreDia != null) || (this.dianombreDia != null && !this.dianombreDia.equals(other.dianombreDia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.DisponibilidadPK[ instructorPersonanumeroDocumento=" + instructorPersonanumeroDocumento + ", instructorPersonaDocumentoidDocumento=" + instructorPersonaDocumentoidDocumento + ", horaInicio=" + horaInicio + ", jornadasiglaJornada=" + jornadasiglaJornada + ", dianombreDia=" + dianombreDia + " ]";
    }
    
}
