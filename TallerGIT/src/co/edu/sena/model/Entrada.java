/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JART
 */
@Entity
@Table(name = "entrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrada.findAll", query = "SELECT e FROM Entrada e")
    , @NamedQuery(name = "Entrada.findByNumeroaprendiz", query = "SELECT e FROM Entrada e WHERE e.numeroaprendiz = :numeroaprendiz")
    , @NamedQuery(name = "Entrada.findByNombreaprendiz", query = "SELECT e FROM Entrada e WHERE e.nombreaprendiz = :nombreaprendiz")
    , @NamedQuery(name = "Entrada.findByFichadeaprendiz", query = "SELECT e FROM Entrada e WHERE e.fichadeaprendiz = :fichadeaprendiz")
    , @NamedQuery(name = "Entrada.findByNombredeficha", query = "SELECT e FROM Entrada e WHERE e.nombredeficha = :nombredeficha")
    , @NamedQuery(name = "Entrada.findByFecha", query = "SELECT e FROM Entrada e WHERE e.fecha = :fecha")
    , @NamedQuery(name = "Entrada.findByObservacion", query = "SELECT e FROM Entrada e WHERE e.observacion = :observacion")})
public class Entrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numeroaprendiz")
    private Integer numeroaprendiz;
    @Basic(optional = false)
    @Column(name = "nombreaprendiz")
    private String nombreaprendiz;
    @Basic(optional = false)
    @Column(name = "fichadeaprendiz")
    private int fichadeaprendiz;
    @Basic(optional = false)
    @Column(name = "nombredeficha")
    private String nombredeficha;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "cedulaaprendiz", referencedColumnName = "cedulaaprendiz")
    @ManyToOne(optional = false)
    private Informacionaprendiz cedulaaprendiz;

    public Entrada() {
    }

    public Entrada(Integer numeroaprendiz) {
        this.numeroaprendiz = numeroaprendiz;
    }

    public Entrada(Integer numeroaprendiz, String nombreaprendiz, int fichadeaprendiz, String nombredeficha, Date fecha, String observacion) {
        this.numeroaprendiz = numeroaprendiz;
        this.nombreaprendiz = nombreaprendiz;
        this.fichadeaprendiz = fichadeaprendiz;
        this.nombredeficha = nombredeficha;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public Integer getNumeroaprendiz() {
        return numeroaprendiz;
    }

    public void setNumeroaprendiz(Integer numeroaprendiz) {
        this.numeroaprendiz = numeroaprendiz;
    }

    public String getNombreaprendiz() {
        return nombreaprendiz;
    }

    public void setNombreaprendiz(String nombreaprendiz) {
        this.nombreaprendiz = nombreaprendiz;
    }

    public int getFichadeaprendiz() {
        return fichadeaprendiz;
    }

    public void setFichadeaprendiz(int fichadeaprendiz) {
        this.fichadeaprendiz = fichadeaprendiz;
    }

    public String getNombredeficha() {
        return nombredeficha;
    }

    public void setNombredeficha(String nombredeficha) {
        this.nombredeficha = nombredeficha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Informacionaprendiz getCedulaaprendiz() {
        return cedulaaprendiz;
    }

    public void setCedulaaprendiz(Informacionaprendiz cedulaaprendiz) {
        this.cedulaaprendiz = cedulaaprendiz;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroaprendiz != null ? numeroaprendiz.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
        if ((this.numeroaprendiz == null && other.numeroaprendiz != null) || (this.numeroaprendiz != null && !this.numeroaprendiz.equals(other.numeroaprendiz))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.model.Entrada[ numeroaprendiz=" + numeroaprendiz + " ]";
    }
    
}
