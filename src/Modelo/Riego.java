/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ricardo
 */
@Entity
@Table(name = "riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Riego.findAll", query = "SELECT r FROM Riego r")
    , @NamedQuery(name = "Riego.findByIdRiego", query = "SELECT r FROM Riego r WHERE r.idRiego = :idRiego")
    , @NamedQuery(name = "Riego.findByTemperatura", query = "SELECT r FROM Riego r WHERE r.temperatura = :temperatura")
    , @NamedQuery(name = "Riego.findByHumedad", query = "SELECT r FROM Riego r WHERE r.humedad = :humedad")
    , @NamedQuery(name = "Riego.findByTimInicio", query = "SELECT r FROM Riego r WHERE r.timInicio = :timInicio")
    , @NamedQuery(name = "Riego.findByTimFin", query = "SELECT r FROM Riego r WHERE r.timFin = :timFin")
    , @NamedQuery(name = "Riego.findByTimDia", query = "SELECT r FROM Riego r WHERE r.timDia = :timDia")
    , @NamedQuery(name = "Riego.findByFecha", query = "SELECT r FROM Riego r WHERE r.fecha = :fecha")})
public class Riego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idRiego")
    private Integer idRiego;
    @Column(name = "temperatura")
    private String temperatura;
    @Column(name = "humedad")
    private String humedad;
    @Column(name = "tim_inicio")
    private String timInicio;
    @Column(name = "tim_fin")
    private String timFin;
    @Column(name = "tim_dia")
    private String timDia;
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "Persona", referencedColumnName = "idPersona")
    @ManyToOne(optional = false)
    private Persona persona;

    public Riego() {
    }

    public Riego(Integer idRiego) {
        this.idRiego = idRiego;
    }

    public Integer getIdRiego() {
        return idRiego;
    }

    public void setIdRiego(Integer idRiego) {
        this.idRiego = idRiego;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public String getTimInicio() {
        return timInicio;
    }

    public void setTimInicio(String timInicio) {
        this.timInicio = timInicio;
    }

    public String getTimFin() {
        return timFin;
    }

    public void setTimFin(String timFin) {
        this.timFin = timFin;
    }

    public String getTimDia() {
        return timDia;
    }

    public void setTimDia(String timDia) {
        this.timDia = timDia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRiego != null ? idRiego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Riego)) {
            return false;
        }
        Riego other = (Riego) object;
        if ((this.idRiego == null && other.idRiego != null) || (this.idRiego != null && !this.idRiego.equals(other.idRiego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Riego[ idRiego=" + idRiego + " ]";
    }
    
}
