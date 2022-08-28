/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Aprendiz
 */
@Entity
@Table(name = "informacionaprendiz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Informacionaprendiz.findAll", query = "SELECT i FROM Informacionaprendiz i")
    , @NamedQuery(name = "Informacionaprendiz.findByCedulaaprendiz", query = "SELECT i FROM Informacionaprendiz i WHERE i.cedulaaprendiz = :cedulaaprendiz")
    , @NamedQuery(name = "Informacionaprendiz.findByNombreaprendiz", query = "SELECT i FROM Informacionaprendiz i WHERE i.nombreaprendiz = :nombreaprendiz")
    , @NamedQuery(name = "Informacionaprendiz.findByFichaaprendiz", query = "SELECT i FROM Informacionaprendiz i WHERE i.fichaaprendiz = :fichaaprendiz")
    , @NamedQuery(name = "Informacionaprendiz.findByNombreficha", query = "SELECT i FROM Informacionaprendiz i WHERE i.nombreficha = :nombreficha")})
//    , @NamedQuery(name = "Informacionaprendiz.findByObservaciones", query = "SELECT i FROM Informacionaprendiz i WHERE i.observaciones = :observaciones")})
public class Informacionaprendiz implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cedulaaprendiz")
    private Collection<Entrada> entradaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cedulaaprendiz")
    private Integer cedulaaprendiz;
    @Basic(optional = false)
    @Column(name = "nombreaprendiz")
    private String nombreaprendiz;
    @Basic(optional = false)
    @Column(name = "fichaaprendiz")
    private int fichaaprendiz;
    @Basic(optional = false)
    @Column(name = "nombreficha")
    private String nombreficha;
//    @Column(name = "Observaciones")
//    private String observaciones;

    public Informacionaprendiz() {
    }

    public Informacionaprendiz(Integer cedulaaprendiz) {
        this.cedulaaprendiz = cedulaaprendiz;
    }

    public Informacionaprendiz(Integer cedulaaprendiz, String nombreaprendiz, int fichaaprendiz, String nombreficha) {
        this.cedulaaprendiz = cedulaaprendiz;
        this.nombreaprendiz = nombreaprendiz;
        this.fichaaprendiz = fichaaprendiz;
        this.nombreficha = nombreficha;
    }

    public Integer getCedulaaprendiz() {
        return this.cedulaaprendiz;
    }

    public void setCedulaaprendiz(Integer cedulaaprendiz) {
        this.cedulaaprendiz = cedulaaprendiz;
    }

    public String getNombreaprendiz() {
        return this.nombreaprendiz;
    }

    public void setNombreaprendiz(String nombreaprendiz) {
        this.nombreaprendiz = nombreaprendiz;
    }

    public int getFichaaprendiz() {
        return this.fichaaprendiz;
    }

    public void setFichaaprendiz(int fichaaprendiz) {
        this.fichaaprendiz = fichaaprendiz;
    }

    public String getNombreficha() {
        return this.nombreficha;
    }

    public void setNombreficha(String nombreficha) {
        this.nombreficha = nombreficha;
    }

//    public String getObservaciones() {
//        return observaciones;
//    }
//
//    public void setObservaciones(String observaciones) {
//        this.observaciones = observaciones;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaaprendiz != null ? cedulaaprendiz.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informacionaprendiz)) {
            return false;
        }
        Informacionaprendiz other = (Informacionaprendiz) object;
        if ((this.cedulaaprendiz == null && other.cedulaaprendiz != null) || (this.cedulaaprendiz != null && !this.cedulaaprendiz.equals(other.cedulaaprendiz))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
   return String.valueOf(cedulaaprendiz);
    }

    @XmlTransient
    public Collection<Entrada> getEntradaCollection() {
        return entradaCollection;
    }

    public void setEntradaCollection(Collection<Entrada> entradaCollection) {
        this.entradaCollection = entradaCollection;
    }
    
}
