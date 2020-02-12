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
import Modelo.Riego;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class ControladorRiego {

    EntityManager em;

    public ControladorRiego() {
        em = MySQLDB.init();
    }

    public void createRiego(Riego u) {
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Riego> findAll() {
        Query query = em.createNamedQuery("Riego.findAll");
        return query.getResultList();
    }

    public List<String> findCout() {
        Query query = em.createQuery("SELECT COUNT(r.persona) from Riego r group by r.persona.idPersona");
         List<String> years = query.getResultList();
         return years;
    }
    
    public List<String> findCout1() {
        Query query = em.createQuery("SELECT (r.persona.nombre) from Riego r group by r.persona.idPersona");
         List<String> years = query.getResultList();
         return years;
    }

    public Riego findByID(int id) {
        Riego u = em.find(Riego.class, id);
        if (u == null) {
            u = null;
        }
        return u;
    }

    public boolean eliminar(int id) {
        try {
            em.getTransaction().begin();
            Riego u = em.find(Riego.class, id);
            em.remove(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
        return true;
    }

    public boolean edit(Riego u) {
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
