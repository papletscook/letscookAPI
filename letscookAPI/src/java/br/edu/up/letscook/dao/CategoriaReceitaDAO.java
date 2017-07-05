/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class CategoriaReceitaDAO extends AbstractHibernateDAO implements InterfaceDAO<CategoriaReceita> {

    @Override
    public void cadastrar(CategoriaReceita t) {
        super.persist(t);
    }

    @Override
    public void excluir(CategoriaReceita t) {
        super.remove(t);
    }

    @Override
    public CategoriaReceita editar(CategoriaReceita t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<CategoriaReceita> listar() {
        try {
            return em.createQuery("FROM CategoriaReceita c").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public CategoriaReceita buscarPorId(CategoriaReceita t) {
        return em.find(CategoriaReceita.class, t.getId());
    }

}
