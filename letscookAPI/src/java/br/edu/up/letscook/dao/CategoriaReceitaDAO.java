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
public class CategoriaReceitaDAO extends GenericHibernateDAO<CategoriaReceita> implements GenericDAO<CategoriaReceita> {

    @Override
    public List<CategoriaReceita> listar() {
        try {
            return getEm().createQuery("FROM CategoriaReceita c").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public CategoriaReceita buscarPorId(CategoriaReceita t) {
        try {
            return getEm().find(CategoriaReceita.class, t.getId());
        } catch (Exception e) {
            return null;
        } finally {
            this.close();
        }
    }

}
