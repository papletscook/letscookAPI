/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.dao.exception.FalhaAoCadastrarException;

/**
 *
 * @author G0042204
 * @param <T>
 */
public abstract class GenericHibernateDAO<T> extends AbstractHibernateDAO implements GenericDAO<T> {

    @Override
    public void cadastrar(T g) throws FalhaAoCadastrarException {
        try {
            super.persist(g);
        } catch (Exception e) {
            e.printStackTrace();
            throw new FalhaAoCadastrarException();
        }
    }

    @Override
    public void excluir(T g) {
        super.remove(g);
    }

    @Override
    public T editar(T g) {
        super.merge(g);
        return g;
    }

}
