/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class IngredienteDAOImpl extends GenericHibernateDAO<Ingrediente> implements NamedEntityDAO<Ingrediente> {

    @Override
    public List<Ingrediente> listar() {
        try {
            return getEm().createQuery("FROM Ingrediente i").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public List<Ingrediente> listarPorNome(String nome
    ) {
        try {
            return getEm().createQuery("FROM Ingrediente r WHERE UPPER(r.nome) LIKE UPPER(:param)")
                    .setParameter("param", "%" + nome + "%")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public Ingrediente buscarPorId(Ingrediente ts) {
        try {
            return getEm().find(Ingrediente.class, ts.getId());
        } catch (Exception e) {
            return null;
        } finally {
            this.close();
        }
    }

}
