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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "programa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programa.findAll", query = "SELECT p FROM Programa p")
    , @NamedQuery(name = "Programa.findByCodigo", query = "SELECT p FROM Programa p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Programa.findByNombre", query = "SELECT p FROM Programa p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Programa.findByVersion", query = "SELECT p FROM Programa p WHERE p.version = :version")
    , @NamedQuery(name = "Programa.findBySigla", query = "SELECT p FROM Programa p WHERE p.sigla = :sigla")
    , @NamedQuery(name = "Programa.findByEstado", query = "SELECT p FROM Programa p WHERE p.estado = :estado")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Version")
    private String version;
    @Basic(optional = false)
    @Column(name = "Sigla")
    private String sigla;
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumn(name = "Nivel_Formacion_nivel_Formacion", referencedColumnName = "nivel_Formacion")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private NivelFormacion nivelFormacionnivelFormacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programa", fetch = FetchType.EAGER)
    private List<ProgramaHasCompetencia> programaHasCompetenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programaCodigo", fetch = FetchType.EAGER)
    private List<Ficha> fichaList;

    public Programa() {
    }

    public Programa(String codigo) {
        this.codigo = codigo;
    }

    public Programa(String codigo, String nombre, String version, String sigla) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.version = version;
        this.sigla = sigla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public NivelFormacion getNivelFormacionnivelFormacion() {
        return nivelFormacionnivelFormacion;
    }

    public void setNivelFormacionnivelFormacion(NivelFormacion nivelFormacionnivelFormacion) {
        this.nivelFormacionnivelFormacion = nivelFormacionnivelFormacion;
    }

    @XmlTransient
    public List<ProgramaHasCompetencia> getProgramaHasCompetenciaList() {
        return programaHasCompetenciaList;
    }

    public void setProgramaHasCompetenciaList(List<ProgramaHasCompetencia> programaHasCompetenciaList) {
        this.programaHasCompetenciaList = programaHasCompetenciaList;
    }

    @XmlTransient
    public List<Ficha> getFichaList() {
        return fichaList;
    }

    public void setFichaList(List<Ficha> fichaList) {
        this.fichaList = fichaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ejemploorm.model.entities.Programa[ codigo=" + codigo + " ]";
    }
    
}
