/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author G0042204
 */
public abstract class AbstractHibernateDAO {

    protected EntityManager em = ConexaoSingleton.getInstance();

    public void persist(Object o) {
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            close();
        }
    }

    public void remove(Object o) {
        em.getTransaction().begin();
        em.remove(em.merge(o));
        em.getTransaction().commit();
        close();
    }

    public void merge(Object o) {
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
        close();
    }

    public void close() {
        if (em.isOpen()) {
            em.close();
        }
    }

}
