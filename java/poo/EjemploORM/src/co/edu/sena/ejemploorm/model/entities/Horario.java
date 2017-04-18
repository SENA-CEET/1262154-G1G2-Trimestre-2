/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ejemploorm.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h")
    , @NamedQuery(name = "Horario.findByInstructorPersonanumeroDocumento", query = "SELECT h FROM Horario h WHERE h.horarioPK.instructorPersonanumeroDocumento = :instructorPersonanumeroDocumento")
    , @NamedQuery(name = "Horario.findByInstructorPersonaDocumentoidDocumento", query = "SELECT h FROM Horario h WHERE h.horarioPK.instructorPersonaDocumentoidDocumento = :instructorPersonaDocumentoidDocumento")
    , @NamedQuery(name = "Horario.findByHoraInicio", query = "SELECT h FROM Horario h WHERE h.horaInicio = :horaInicio")
    , @NamedQuery(name = "Horario.findByHoraFin", query = "SELECT h FROM Horario h WHERE h.horaFin = :horaFin")
    , @NamedQuery(name = "Horario.findByVersion", query = "SELECT h FROM Horario h WHERE h.horarioPK.version = :version")
    , @NamedQuery(name = "Horario.findByHorarioFinal", query = "SELECT h FROM Horario h WHERE h.horarioFinal = :horarioFinal")
    , @NamedQuery(name = "Horario.findByAmbientenumeroAmbiente", query = "SELECT h FROM Horario h WHERE h.horarioPK.ambientenumeroAmbiente = :ambientenumeroAmbiente")
    , @NamedQuery(name = "Horario.findByAmbienteSedenombreSede", query = "SELECT h FROM Horario h WHERE h.horarioPK.ambienteSedenombreSede = :ambienteSedenombreSede")
    , @NamedQuery(name = "Horario.findByDianombreDia", query = "SELECT h FROM Horario h WHERE h.horarioPK.dianombreDia = :dianombreDia")
    , @NamedQuery(name = "Horario.findByFichahasTrimestreFichanumeroFicha", query = "SELECT h FROM Horario h WHERE h.horarioPK.fichahasTrimestreFichanumeroFicha = :fichahasTrimestreFichanumeroFicha")
    , @NamedQuery(name = "Horario.findByFichahasTrimestreTrimestrenombreTrimestre", query = "SELECT h FROM Horario h WHERE h.horarioPK.fichahasTrimestreTrimestrenombreTrimestre = :fichahasTrimestreTrimestrenombreTrimestre")
    , @NamedQuery(name = "Horario.findByFichahasTrimestreTrimestreJornadasiglaJornada", query = "SELECT h FROM Horario h WHERE h.horarioPK.fichahasTrimestreTrimestreJornadasiglaJornada = :fichahasTrimestreTrimestreJornadasiglaJornada")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HorarioPK horarioPK;
    @Basic(optional = false)
    @Column(name = "Hora_Inicio")
    private String horaInicio;
    @Basic(optional = false)
    @Column(name = "Hora_Fin")
    private String horaFin;
    @Basic(optional = false)
    @Column(name = "HorarioFinal")
    private int horarioFinal;
    @JoinColumns({
        @JoinColumn(name = "Ambiente_numero_Ambiente", referencedColumnName = "numero_Ambiente", insertable = false, updatable = false)
        , @JoinColumn(name = "Ambiente_Sede_nombre_Sede", referencedColumnName = "Sede_nombre_Sede", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Ambiente ambiente;
    @JoinColumn(name = "Dia_nombre_Dia", referencedColumnName = "nombre_Dia", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Dia dia;
    @JoinColumns({
        @JoinColumn(name = "Ficha_has_Trimestre_Ficha_numero_Ficha", referencedColumnName = "Ficha_numero_Ficha", insertable = false, updatable = false)
        , @JoinColumn(name = "Ficha_has_Trimestre_Trimestre_nombre_Trimestre", referencedColumnName = "Trimestre_nombre_Trimestre", insertable = false, updatable = false)
        , @JoinColumn(name = "Ficha_has_Trimestre_Trimestre_Jornada_sigla_Jornada", referencedColumnName = "Trimestre_Jornada_sigla_Jornada", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private FichaHasTrimestre fichaHasTrimestre;
    @JoinColumns({
        @JoinColumn(name = "Instructor_Persona_numero_Documento", referencedColumnName = "Persona_numero_Documento", insertable = false, updatable = false)
        , @JoinColumn(name = "Instructor_Persona_Documento_id_Documento", referencedColumnName = "Persona_Documento_id_Documento", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Instructor instructor;
    @JoinColumn(name = "Modalidad_nombre_Modalidad", referencedColumnName = "nombre_Modalidad")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Modalidad modalidadnombreModalidad;
    @JoinColumn(name = "Trimestre_Actual_idTrimestre_Actual", referencedColumnName = "idTrimestre_Actual")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TrimestreActual trimestreActualidTrimestreActual;

    public Horario() {
    }

    public Horario(HorarioPK horarioPK) {
        this.horarioPK = horarioPK;
    }

    public Horario(HorarioPK horarioPK, String horaInicio, String horaFin, int horarioFinal) {
        this.horarioPK = horarioPK;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.horarioFinal = horarioFinal;
    }

    public Horario(String instructorPersonanumeroDocumento, String instructorPersonaDocumentoidDocumento, int version, String ambientenumeroAmbiente, String ambienteSedenombreSede, String dianombreDia, String fichahasTrimestreFichanumeroFicha, String fichahasTrimestreTrimestrenombreTrimestre, String fichahasTrimestreTrimestreJornadasiglaJornada) {
        this.horarioPK = new HorarioPK(instructorPersonanumeroDocumento, instructorPersonaDocumentoidDocumento, version, ambientenumeroAmbiente, ambienteSedenombreSede, dianombreDia, fichahasTrimestreFichanumeroFicha, fichahasTrimestreTrimestrenombreTrimestre, fichahasTrimestreTrimestreJornadasiglaJornada);
    }

    public HorarioPK getHorarioPK() {
        return horarioPK;
    }

    public void setHorarioPK(HorarioPK horarioPK) {
        this.horarioPK = horarioPK;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(int horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public FichaHasTrimestre getFichaHasTrimestre() {
        return fichaHasTrimestre;
    }

    public void setFichaHasTrimestre(FichaHasTrimestre fichaHasTrimestre) {
        this.fichaHasTrimestre = fichaHasTrimestre;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Modalidad getModalidadnombreModalidad() {
        return modalidadnombreModalidad;
    }

    public void setModalidadnombreModalidad(Modalidad modalidadnombreModalidad) {
        this.modalidadnombreModalidad = modalidadnombreModalidad;
    }

    public TrimestreActual getTrimestreActualidTrimestreActual() {
        return trimestreActualidTrimestreActual;
    }

    public void setTrimestreActualidTrimestreActual(TrimestreActual trimestreActualidTrimestreActual) {
        this.trimestreActualidTrimestreActual = trimestreActualidTrimestreActual;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horarioPK != null ? horarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.horarioPK == null && other.horarioPK != null) || (this.horarioPK != null && !this.horarioPK.equals(other.horarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Horario[ horarioPK=" + horarioPK + " ]";
    }
    
}
