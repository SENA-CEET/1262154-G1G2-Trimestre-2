/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "persona_has_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaHasRol.findAll", query = "SELECT p FROM PersonaHasRol p")
    , @NamedQuery(name = "PersonaHasRol.findByPersonanumeroDocumento", query = "SELECT p FROM PersonaHasRol p WHERE p.personaHasRolPK.personanumeroDocumento = :personanumeroDocumento")
    , @NamedQuery(name = "PersonaHasRol.findByPersonaDocumentoidDocumento", query = "SELECT p FROM PersonaHasRol p WHERE p.personaHasRolPK.personaDocumentoidDocumento = :personaDocumentoidDocumento")
    , @NamedQuery(name = "PersonaHasRol.findByRolidRol", query = "SELECT p FROM PersonaHasRol p WHERE p.personaHasRolPK.rolidRol = :rolidRol")
    , @NamedQuery(name = "PersonaHasRol.findByEstado", query = "SELECT p FROM PersonaHasRol p WHERE p.estado = :estado")})
public class PersonaHasRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaHasRolPK personaHasRolPK;
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumns({
        @JoinColumn(name = "Persona_numero_Documento", referencedColumnName = "numero_Documento", insertable = false, updatable = false)
        , @JoinColumn(name = "Persona_Documento_id_Documento", referencedColumnName = "Documento_id_Documento", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Persona persona;
    @JoinColumn(name = "Rol_id_Rol", referencedColumnName = "id_Rol", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Rol rol;

    public PersonaHasRol() {
    }

    public PersonaHasRol(PersonaHasRolPK personaHasRolPK) {
        this.personaHasRolPK = personaHasRolPK;
    }

    public PersonaHasRol(String personanumeroDocumento, String personaDocumentoidDocumento, String rolidRol) {
        this.personaHasRolPK = new PersonaHasRolPK(personanumeroDocumento, personaDocumentoidDocumento, rolidRol);
    }

    public PersonaHasRolPK getPersonaHasRolPK() {
        return personaHasRolPK;
    }

    public void setPersonaHasRolPK(PersonaHasRolPK personaHasRolPK) {
        this.personaHasRolPK = personaHasRolPK;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaHasRolPK != null ? personaHasRolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaHasRol)) {
            return false;
        }
        PersonaHasRol other = (PersonaHasRol) object;
        if ((this.personaHasRolPK == null && other.personaHasRolPK != null) || (this.personaHasRolPK != null && !this.personaHasRolPK.equals(other.personaHasRolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.PersonaHasRol[ personaHasRolPK=" + personaHasRolPK + " ]";
    }
    
}
