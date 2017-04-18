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
public class HorarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Instructor_Persona_numero_Documento")
    private String instructorPersonanumeroDocumento;
    @Basic(optional = false)
    @Column(name = "Instructor_Persona_Documento_id_Documento")
    private String instructorPersonaDocumentoidDocumento;
    @Basic(optional = false)
    @Column(name = "Version")
    private int version;
    @Basic(optional = false)
    @Column(name = "Ambiente_numero_Ambiente")
    private String ambientenumeroAmbiente;
    @Basic(optional = false)
    @Column(name = "Ambiente_Sede_nombre_Sede")
    private String ambienteSedenombreSede;
    @Basic(optional = false)
    @Column(name = "Dia_nombre_Dia")
    private String dianombreDia;
    @Basic(optional = false)
    @Column(name = "Ficha_has_Trimestre_Ficha_numero_Ficha")
    private String fichahasTrimestreFichanumeroFicha;
    @Basic(optional = false)
    @Column(name = "Ficha_has_Trimestre_Trimestre_nombre_Trimestre")
    private String fichahasTrimestreTrimestrenombreTrimestre;
    @Basic(optional = false)
    @Column(name = "Ficha_has_Trimestre_Trimestre_Jornada_sigla_Jornada")
    private String fichahasTrimestreTrimestreJornadasiglaJornada;

    public HorarioPK() {
    }

    public HorarioPK(String instructorPersonanumeroDocumento, String instructorPersonaDocumentoidDocumento, int version, String ambientenumeroAmbiente, String ambienteSedenombreSede, String dianombreDia, String fichahasTrimestreFichanumeroFicha, String fichahasTrimestreTrimestrenombreTrimestre, String fichahasTrimestreTrimestreJornadasiglaJornada) {
        this.instructorPersonanumeroDocumento = instructorPersonanumeroDocumento;
        this.instructorPersonaDocumentoidDocumento = instructorPersonaDocumentoidDocumento;
        this.version = version;
        this.ambientenumeroAmbiente = ambientenumeroAmbiente;
        this.ambienteSedenombreSede = ambienteSedenombreSede;
        this.dianombreDia = dianombreDia;
        this.fichahasTrimestreFichanumeroFicha = fichahasTrimestreFichanumeroFicha;
        this.fichahasTrimestreTrimestrenombreTrimestre = fichahasTrimestreTrimestrenombreTrimestre;
        this.fichahasTrimestreTrimestreJornadasiglaJornada = fichahasTrimestreTrimestreJornadasiglaJornada;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getAmbientenumeroAmbiente() {
        return ambientenumeroAmbiente;
    }

    public void setAmbientenumeroAmbiente(String ambientenumeroAmbiente) {
        this.ambientenumeroAmbiente = ambientenumeroAmbiente;
    }

    public String getAmbienteSedenombreSede() {
        return ambienteSedenombreSede;
    }

    public void setAmbienteSedenombreSede(String ambienteSedenombreSede) {
        this.ambienteSedenombreSede = ambienteSedenombreSede;
    }

    public String getDianombreDia() {
        return dianombreDia;
    }

    public void setDianombreDia(String dianombreDia) {
        this.dianombreDia = dianombreDia;
    }

    public String getFichahasTrimestreFichanumeroFicha() {
        return fichahasTrimestreFichanumeroFicha;
    }

    public void setFichahasTrimestreFichanumeroFicha(String fichahasTrimestreFichanumeroFicha) {
        this.fichahasTrimestreFichanumeroFicha = fichahasTrimestreFichanumeroFicha;
    }

    public String getFichahasTrimestreTrimestrenombreTrimestre() {
        return fichahasTrimestreTrimestrenombreTrimestre;
    }

    public void setFichahasTrimestreTrimestrenombreTrimestre(String fichahasTrimestreTrimestrenombreTrimestre) {
        this.fichahasTrimestreTrimestrenombreTrimestre = fichahasTrimestreTrimestrenombreTrimestre;
    }

    public String getFichahasTrimestreTrimestreJornadasiglaJornada() {
        return fichahasTrimestreTrimestreJornadasiglaJornada;
    }

    public void setFichahasTrimestreTrimestreJornadasiglaJornada(String fichahasTrimestreTrimestreJornadasiglaJornada) {
        this.fichahasTrimestreTrimestreJornadasiglaJornada = fichahasTrimestreTrimestreJornadasiglaJornada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instructorPersonanumeroDocumento != null ? instructorPersonanumeroDocumento.hashCode() : 0);
        hash += (instructorPersonaDocumentoidDocumento != null ? instructorPersonaDocumentoidDocumento.hashCode() : 0);
        hash += (int) version;
        hash += (ambientenumeroAmbiente != null ? ambientenumeroAmbiente.hashCode() : 0);
        hash += (ambienteSedenombreSede != null ? ambienteSedenombreSede.hashCode() : 0);
        hash += (dianombreDia != null ? dianombreDia.hashCode() : 0);
        hash += (fichahasTrimestreFichanumeroFicha != null ? fichahasTrimestreFichanumeroFicha.hashCode() : 0);
        hash += (fichahasTrimestreTrimestrenombreTrimestre != null ? fichahasTrimestreTrimestrenombreTrimestre.hashCode() : 0);
        hash += (fichahasTrimestreTrimestreJornadasiglaJornada != null ? fichahasTrimestreTrimestreJornadasiglaJornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorarioPK)) {
            return false;
        }
        HorarioPK other = (HorarioPK) object;
        if ((this.instructorPersonanumeroDocumento == null && other.instructorPersonanumeroDocumento != null) || (this.instructorPersonanumeroDocumento != null && !this.instructorPersonanumeroDocumento.equals(other.instructorPersonanumeroDocumento))) {
            return false;
        }
        if ((this.instructorPersonaDocumentoidDocumento == null && other.instructorPersonaDocumentoidDocumento != null) || (this.instructorPersonaDocumentoidDocumento != null && !this.instructorPersonaDocumentoidDocumento.equals(other.instructorPersonaDocumentoidDocumento))) {
            return false;
        }
        if (this.version != other.version) {
            return false;
        }
        if ((this.ambientenumeroAmbiente == null && other.ambientenumeroAmbiente != null) || (this.ambientenumeroAmbiente != null && !this.ambientenumeroAmbiente.equals(other.ambientenumeroAmbiente))) {
            return false;
        }
        if ((this.ambienteSedenombreSede == null && other.ambienteSedenombreSede != null) || (this.ambienteSedenombreSede != null && !this.ambienteSedenombreSede.equals(other.ambienteSedenombreSede))) {
            return false;
        }
        if ((this.dianombreDia == null && other.dianombreDia != null) || (this.dianombreDia != null && !this.dianombreDia.equals(other.dianombreDia))) {
            return false;
        }
        if ((this.fichahasTrimestreFichanumeroFicha == null && other.fichahasTrimestreFichanumeroFicha != null) || (this.fichahasTrimestreFichanumeroFicha != null && !this.fichahasTrimestreFichanumeroFicha.equals(other.fichahasTrimestreFichanumeroFicha))) {
            return false;
        }
        if ((this.fichahasTrimestreTrimestrenombreTrimestre == null && other.fichahasTrimestreTrimestrenombreTrimestre != null) || (this.fichahasTrimestreTrimestrenombreTrimestre != null && !this.fichahasTrimestreTrimestrenombreTrimestre.equals(other.fichahasTrimestreTrimestrenombreTrimestre))) {
            return false;
        }
        if ((this.fichahasTrimestreTrimestreJornadasiglaJornada == null && other.fichahasTrimestreTrimestreJornadasiglaJornada != null) || (this.fichahasTrimestreTrimestreJornadasiglaJornada != null && !this.fichahasTrimestreTrimestreJornadasiglaJornada.equals(other.fichahasTrimestreTrimestreJornadasiglaJornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.HorarioPK[ instructorPersonanumeroDocumento=" + instructorPersonanumeroDocumento + ", instructorPersonaDocumentoidDocumento=" + instructorPersonaDocumentoidDocumento + ", version=" + version + ", ambientenumeroAmbiente=" + ambientenumeroAmbiente + ", ambienteSedenombreSede=" + ambienteSedenombreSede + ", dianombreDia=" + dianombreDia + ", fichahasTrimestreFichanumeroFicha=" + fichahasTrimestreFichanumeroFicha + ", fichahasTrimestreTrimestrenombreTrimestre=" + fichahasTrimestreTrimestrenombreTrimestre + ", fichahasTrimestreTrimestreJornadasiglaJornada=" + fichahasTrimestreTrimestreJornadasiglaJornada + " ]";
    }
    
}
