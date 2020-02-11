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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinic
 */
@Entity
@Table(name = "riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Riego.findAll", query = "SELECT r FROM Riego r"),
    @NamedQuery(name = "Riego.findByIdRiego", query = "SELECT r FROM Riego r WHERE r.idRiego = :idRiego"),
    @NamedQuery(name = "Riego.findByTemperatura", query = "SELECT r FROM Riego r WHERE r.temperatura = :temperatura"),
    @NamedQuery(name = "Riego.findByHumedad", query = "SELECT r FROM Riego r WHERE r.humedad = :humedad"),
    @NamedQuery(name = "Riego.findByRegadera", query = "SELECT r FROM Riego r WHERE r.regadera = :regadera"),
    @NamedQuery(name = "Riego.findByLluvia", query = "SELECT r FROM Riego r WHERE r.lluvia = :lluvia"),
    @NamedQuery(name = "Riego.findByFecha", query = "SELECT r FROM Riego r WHERE r.fecha = :fecha"),
    //SELECT COUNT(*) as num, Persona.nombre as NOM from riego, persona WHERE persona.idPersona = riego.Persona  group by riego.Persona
    @NamedQuery(name = "Riego.findByHora", query = "SELECT r FROM Riego r WHERE r.hora = :hora")})
public class Riego implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRiego")
    private Integer idRiego;
    @Column(name = "temperatura")
    private String temperatura;
    @Column(name = "humedad")
    private String humedad;
    @Column(name = "regadera")
    private String regadera;
    @Column(name = "lluvia")
    private String lluvia;
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "hora")
    private String hora;
    @JoinColumn(name = "Persona", referencedColumnName = "idPersona")
    @ManyToOne(optional = false)
    private Persona persona;

    public Riego() {
    }

    public Riego(Integer idRiego, String temperatura, String humedad, String regadera, String lluvia, String fecha, String hora, Persona persona) {
        this.idRiego = idRiego;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.regadera = regadera;
        this.lluvia = lluvia;
        this.fecha = fecha;
        this.hora = hora;
        this.persona = persona;
    }
    
    
    public Riego(Integer idRiego) {
        this.idRiego = idRiego;
    }

    public Riego(Integer idRiego, String hora) {
        this.idRiego = idRiego;
        this.hora = hora;
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

    public String getRegadera() {
        return regadera;
    }

    public void setRegadera(String regadera) {
        this.regadera = regadera;
    }

    public String getLluvia() {
        return lluvia;
    }

    public void setLluvia(String lluvia) {
        this.lluvia = lluvia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
