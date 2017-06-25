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
public class IngredienteDAO extends AbstractHibernateDAO implements InterfaceIngredienteDAO {

    @Override
    public void cadastrar(Ingrediente t) {
        super.persist(t);
    }

    @Override
    public void excluir(Ingrediente t) {
        super.remove(t);
    }

    @Override
    public Ingrediente editar(Ingrediente t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<Ingrediente> listar(Ingrediente t) {
        try {
            return em.createQuery("FROM Ingrediente i").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Ingrediente buscarPorId(Ingrediente t) {
        return em.find(Ingrediente.class, t.getId());
    }

    @Override
    public List<Ingrediente> buscarPorNome(String nome) {
        try {
            return em.createQuery("FROM Ingrediente r WHERE UPPER(r.nome) LIKE UPPER(:param)")
                    .setParameter("param", "%" + nome + "%")
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

}
