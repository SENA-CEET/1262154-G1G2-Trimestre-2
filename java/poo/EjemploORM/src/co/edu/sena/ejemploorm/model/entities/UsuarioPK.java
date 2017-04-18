/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Enrique
 */
@Embeddable
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Persona_numero_Documento")
    private String personanumeroDocumento;
    @Basic(optional = false)
    @Column(name = "Persona_Documento_id_Documento")
    private String personaDocumentoidDocumento;

    public UsuarioPK() {
    }

    public UsuarioPK(String personanumeroDocumento, String personaDocumentoidDocumento) {
        this.personanumeroDocumento = personanumeroDocumento;
        this.personaDocumentoidDocumento = personaDocumentoidDocumento;
    }

    public String getPersonanumeroDocumento() {
        return personanumeroDocumento;
    }

    public void setPersonanumeroDocumento(String personanumeroDocumento) {
        this.personanumeroDocumento = personanumeroDocumento;
    }

    public String getPersonaDocumentoidDocumento() {
        return personaDocumentoidDocumento;
    }

    public void setPersonaDocumentoidDocumento(String personaDocumentoidDocumento) {
        this.personaDocumentoidDocumento = personaDocumentoidDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personanumeroDocumento != null ? personanumeroDocumento.hashCode() : 0);
        hash += (personaDocumentoidDocumento != null ? personaDocumentoidDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if ((this.personanumeroDocumento == null && other.personanumeroDocumento != null) || (this.personanumeroDocumento != null && !this.personanumeroDocumento.equals(other.personanumeroDocumento))) {
            return false;
        }
        if ((this.personaDocumentoidDocumento == null && other.personaDocumentoidDocumento != null) || (this.personaDocumentoidDocumento != null && !this.personaDocumentoidDocumento.equals(other.personaDocumentoidDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.UsuarioPK[ personanumeroDocumento=" + personanumeroDocumento + ", personaDocumentoidDocumento=" + personaDocumentoidDocumento + " ]";
    }
    
}
