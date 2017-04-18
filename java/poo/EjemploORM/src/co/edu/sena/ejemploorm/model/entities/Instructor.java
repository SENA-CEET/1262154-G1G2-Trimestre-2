/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "instructor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instructor.findAll", query = "SELECT i FROM Instructor i")
    , @NamedQuery(name = "Instructor.findByPersonanumeroDocumento", query = "SELECT i FROM Instructor i WHERE i.instructorPK.personanumeroDocumento = :personanumeroDocumento")
    , @NamedQuery(name = "Instructor.findByPersonaDocumentoidDocumento", query = "SELECT i FROM Instructor i WHERE i.instructorPK.personaDocumentoidDocumento = :personaDocumentoidDocumento")})
public class Instructor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InstructorPK instructorPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instructor", fetch = FetchType.EAGER)
    private List<Horario> horarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instructor", fetch = FetchType.EAGER)
    private List<Disponibilidad> disponibilidadList;
    @JoinColumn(name = "Especialidad_nombre_Especialidad", referencedColumnName = "nombre_Especialidad")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Especialidad especialidadnombreEspecialidad;
    @JoinColumns({
        @JoinColumn(name = "Persona_numero_Documento", referencedColumnName = "numero_Documento", insertable = false, updatable = false)
        , @JoinColumn(name = "Persona_Documento_id_Documento", referencedColumnName = "Documento_id_Documento", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Persona persona;
    @JoinColumn(name = "Vinculacion_tipo_Vinculacion", referencedColumnName = "tipo_Vinculacion")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Vinculacion vinculaciontipoVinculacion;

    public Instructor() {
    }

    public Instructor(InstructorPK instructorPK) {
        this.instructorPK = instructorPK;
    }

    public Instructor(String personanumeroDocumento, String personaDocumentoidDocumento) {
        this.instructorPK = new InstructorPK(personanumeroDocumento, personaDocumentoidDocumento);
    }

    public InstructorPK getInstructorPK() {
        return instructorPK;
    }

    public void setInstructorPK(InstructorPK instructorPK) {
        this.instructorPK = instructorPK;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @XmlTransient
    public List<Disponibilidad> getDisponibilidadList() {
        return disponibilidadList;
    }

    public void setDisponibilidadList(List<Disponibilidad> disponibilidadList) {
        this.disponibilidadList = disponibilidadList;
    }

    public Especialidad getEspecialidadnombreEspecialidad() {
        return especialidadnombreEspecialidad;
    }

    public void setEspecialidadnombreEspecialidad(Especialidad especialidadnombreEspecialidad) {
        this.especialidadnombreEspecialidad = especialidadnombreEspecialidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vinculacion getVinculaciontipoVinculacion() {
        return vinculaciontipoVinculacion;
    }

    public void setVinculaciontipoVinculacion(Vinculacion vinculaciontipoVinculacion) {
        this.vinculaciontipoVinculacion = vinculaciontipoVinculacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instructorPK != null ? instructorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructor)) {
            return false;
        }
        Instructor other = (Instructor) object;
        if ((this.instructorPK == null && other.instructorPK != null) || (this.instructorPK != null && !this.instructorPK.equals(other.instructorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Instructor[ instructorPK=" + instructorPK + " ]";
    }
    
}
