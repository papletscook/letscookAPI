/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

public class IngredienteReceitaDAOImpl extends GenericHibernateDAO<IngredienteReceita> implements IngredienteReceitaDAO {

    @Override
    public List<IngredienteReceita> listar() {
        try {
            return getEm().createQuery("FROM IngredienteReceita i").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public List<IngredienteReceita> listarPorIngredientes(List<Ingrediente> ingts) {
        try {
            Query query = getEm().createQuery("FROM IngredienteReceita i JOIN FETCH i.receita r WHERE i.ingrediente IN :list");
            query.setParameter("list", ingts);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public IngredienteReceita buscarPorId(IngredienteReceita t) throws Exception {
        try {
            return getEm().find(IngredienteReceita.class, t.getId());
        } catch (Exception e) {
            throw new Exception("Ingrediente inexistente!");
        } finally {
            this.close();
        }
    }

}
