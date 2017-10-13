/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author G0042204
 */
public class CategoriaReceitaDAO extends GenericHibernateDAO<CategoriaReceita> implements GenericNewDAO<CategoriaReceita> {

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
    public List<CategoriaReceita> listarPorNomeAproximado(String nome
    ) {
        try {
            return getEm().createQuery("FROM CategoriaReceita r WHERE UPPER(r.nome) LIKE UPPER(:param)")
                    .setParameter("param", "%" + nome + "%")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public CategoriaReceita buscarPorNome(CategoriaReceita ts) throws Exception {
        try {
            return (CategoriaReceita) getEm().createQuery("FROM CategoriaReceita r WHERE UPPER(r.nome) = UPPER(:param)")
                    .setParameter("param", ts.getNome())
                    .getSingleResult();
        } catch (NoResultException e) {
            throw new Exception("Categoria inexistente!");
        } finally {
            this.close();
        }
    }

    @Override
    public CategoriaReceita buscarPorId(CategoriaReceita ts) throws Exception {
        try {
            return getEm().find(CategoriaReceita.class, ts.getId());
        } catch (Exception e) {
            throw new Exception("Categoria inexistente!");
        } finally {
            this.close();
        }
    }

}
