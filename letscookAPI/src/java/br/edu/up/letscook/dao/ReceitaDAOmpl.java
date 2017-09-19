/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ReceitaDAOmpl extends GenericHibernateDAO<Receita> implements ReceitaDAO<Receita> {

    @Override
    public List<Receita> listar() {
        try {
            return getEm().createQuery("FROM Receita r")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Receita buscarPorId(Receita t) {
        return getEm().find(Receita.class, t.getId());
    }

    @Override
    public List<Receita> buscarPorNome(String nome) {
        try {
            return getEm().createQuery("FROM Receita r WHERE UPPER(r.nome) LIKE UPPER(:param)")
                    .setParameter("param", "%" + nome + "%")
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public List<Receita> buscarPorCategoria(CategoriaReceita categoria) {
        try {
            return getEm().createQuery("FROM Receita r WHERE r.categoria = :param")
                    .setParameter("param", categoria)
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public List<Receita> buscarPorNacionalidade(NacionalidadeEnum nasc) {
        try {
            return getEm().createQuery("FROM Receita r WHERE r.nasc = :param")
                    .setParameter("param", nasc)
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

}
