/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.dao.exception.FalhaAoCadastrarException;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 *
 * @author G0042204
 * @param <T>
 */
public abstract class GenericHibernateDAO<T> extends AbstractHibernateDAO implements GenericDAO<T> {

    private static final Logger LOG = Logger.getLogger(GenericHibernateDAO.class.getName());

    @Override
    public void cadastrar(T g) throws FalhaAoCadastrarException {
        try {
            super.persist(g);
        } catch (Exception e) {
            LOG.log(new LogRecord(Level.SEVERE, e.getStackTrace().toString()));
            throw new FalhaAoCadastrarException();
        }
    }

    @Override
    public void excluir(T g) {
        super.remove(g);
        this.close();
    }

    @Override
    public T editar(T g) {
        super.merge(g);
        this.close();
        return g;
    }

}
