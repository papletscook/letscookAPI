/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.dao;

import br.edu.up.model.entity.Geladeira;
import br.edu.up.model.entity.IngredienteGeladeira;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class IngredienteDAO extends AbstractHibernateDAO implements InterfaceDAO<IngredienteGeladeira> {

    @Override
    public void cadastrar(IngredienteGeladeira t) {
        super.persist(t);
    }

    @Override
    public void excluir(IngredienteGeladeira t) {
        super.remove(t);
    }

    @Override
    public IngredienteGeladeira editar(IngredienteGeladeira t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<IngredienteGeladeira> listar(IngredienteGeladeira t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IngredienteGeladeira buscarPorId(IngredienteGeladeira t) {
        return em.find(IngredienteGeladeira.class, t.getId());
    }

}
