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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByNumeroDocumento", query = "SELECT p FROM Persona p WHERE p.personaPK.numeroDocumento = :numeroDocumento")
    , @NamedQuery(name = "Persona.findByPrimerNombre", query = "SELECT p FROM Persona p WHERE p.primerNombre = :primerNombre")
    , @NamedQuery(name = "Persona.findBySegundoNombre", query = "SELECT p FROM Persona p WHERE p.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Persona.findByPrimerApellido", query = "SELECT p FROM Persona p WHERE p.primerApellido = :primerApellido")
    , @NamedQuery(name = "Persona.findBySegundoApellido", query = "SELECT p FROM Persona p WHERE p.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Persona.findByDocumentoidDocumento", query = "SELECT p FROM Persona p WHERE p.personaPK.documentoidDocumento = :documentoidDocumento")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaPK personaPK;
    @Basic(optional = false)
    @Column(name = "primer_Nombre")
    private String primerNombre;
    @Column(name = "segundo_Nombre")
    private String segundoNombre;
    @Basic(optional = false)
    @Column(name = "primer_Apellido")
    private String primerApellido;
    @Column(name = "segundo_Apellido")
    private String segundoApellido;
    @Lob
    @Column(name = "Foto")
    private byte[] foto;
    @JoinColumn(name = "Documento_id_Documento", referencedColumnName = "id_Documento", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Documento documento;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.EAGER)
    private Instructor instructor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.EAGER)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.EAGER)
    private List<PersonaHasRol> personaHasRolList;

    public Persona() {
    }

    public Persona(PersonaPK personaPK) {
        this.personaPK = personaPK;
    }

    public Persona(PersonaPK personaPK, String primerNombre, String primerApellido) {
        this.personaPK = personaPK;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public Persona(String numeroDocumento, String documentoidDocumento) {
        this.personaPK = new PersonaPK(numeroDocumento, documentoidDocumento);
    }

    public PersonaPK getPersonaPK() {
        return personaPK;
    }

    public void setPersonaPK(PersonaPK personaPK) {
        this.personaPK = personaPK;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<PersonaHasRol> getPersonaHasRolList() {
        return personaHasRolList;
    }

    public void setPersonaHasRolList(List<PersonaHasRol> personaHasRolList) {
        this.personaHasRolList = personaHasRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaPK != null ? personaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.personaPK == null && other.personaPK != null) || (this.personaPK != null && !this.personaPK.equals(other.personaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Persona[ personaPK=" + personaPK + " ]";
    }
    
}
