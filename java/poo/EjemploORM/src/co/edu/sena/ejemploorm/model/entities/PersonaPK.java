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
public class PersonaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "numero_Documento")
    private String numeroDocumento;
    @Basic(optional = false)
    @Column(name = "Documento_id_Documento")
    private String documentoidDocumento;

    public PersonaPK() {
    }

    public PersonaPK(String numeroDocumento, String documentoidDocumento) {
        this.numeroDocumento = numeroDocumento;
        this.documentoidDocumento = documentoidDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDocumentoidDocumento() {
        return documentoidDocumento;
    }

    public void setDocumentoidDocumento(String documentoidDocumento) {
        this.documentoidDocumento = documentoidDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        hash += (documentoidDocumento != null ? documentoidDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaPK)) {
            return false;
        }
        PersonaPK other = (PersonaPK) object;
        if ((this.numeroDocumento == null && other.numeroDocumento != null) || (this.numeroDocumento != null && !this.numeroDocumento.equals(other.numeroDocumento))) {
            return false;
        }
        if ((this.documentoidDocumento == null && other.documentoidDocumento != null) || (this.documentoidDocumento != null && !this.documentoidDocumento.equals(other.documentoidDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.PersonaPK[ numeroDocumento=" + numeroDocumento + ", documentoidDocumento=" + documentoidDocumento + " ]";
    }
    
}
