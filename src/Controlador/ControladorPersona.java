/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import Modelo.Persona;

/**
 *
 * @author gusta
 */
public class ControladorPersona {

    EntityManager em;

    public ControladorPersona() {
        em = MySQLDB.init();
    }

    public void createPersona(Persona u) {
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Persona> findAll() {
        Query query = em.createNamedQuery("Persona.findAll");
        return query.getResultList();
    }

    public Persona findByID(int id) {
        Persona u = em.find(Persona.class, id);
        if (u == null) {
            u = null;
        }
        return u;
    }

    public Persona findByCedula(String cedula) {
        TypedQuery<Persona> consultaPersona = em.createNamedQuery("Persona.findByCedula", Persona.class);
        consultaPersona.setParameter("cedula", cedula);
        Persona u;
        try {
            u = consultaPersona.getSingleResult();
        } catch (Exception e) {
            u = null;
        }
        return u;
    }

    public boolean eliminar(int id) {
        try {
            em.getTransaction().begin();
            Persona u = em.find(Persona.class, id);
            em.remove(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
        return true;
    }

    public boolean edit(Persona u) {
        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }
}
