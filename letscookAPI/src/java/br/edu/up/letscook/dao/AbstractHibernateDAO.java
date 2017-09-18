/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author G0042204
 */
public abstract class AbstractHibernateDAO {

    private EntityManagerFactory emf;

    private EntityManager em;

    public void persist(Object obj) {
        getEm().getTransaction().begin();
        getEm().persist(obj);
        getEm().getTransaction().commit();
    }

    public void remove(Object obj) {
        getEm().getTransaction().begin();
        getEm().remove(getEm().merge(obj));
        getEm().getTransaction().commit();
    }

    public void merge(Object obj) {
        getEm().getTransaction().begin();
        getEm().merge(obj);
        getEm().getTransaction().commit();
    }

    public EntityManager getEm() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("letscookAPIPU");
            em = emf.createEntityManager();
        }
        return em;
    }

    public void close() {
        if (emf.isOpen()) {
            em.close();
            emf.close();
        }
    }

}
