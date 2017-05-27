/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.dao;

import br.edu.up.entity.Receita;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ReceitaDAO extends AbstractHibernateDAO implements InterfaceDAO<Receita> {

    /**
     *
     * @param t
     */
    @Override
    public void cadastrar(Receita t) {
        super.persist(t);
    }

    @Override
    public void excluir(Receita t) {
        super.remove(t);
    }

    @Override
    public Receita editar(Receita t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<Receita> listar(Receita t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Receita buscarPorId(Receita t) {
        return em.find(Receita.class, t.getId());
    }

}
