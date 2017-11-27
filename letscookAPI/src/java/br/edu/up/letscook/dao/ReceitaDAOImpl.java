/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.dao.exception.ReceitaInexistenteException;
import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.enums.StatusPublicacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ReceitaDAOImpl extends GenericHibernateDAO<Receita> implements ReceitaDAO {

    @Override
    public List<Receita> listar() {
        try {
            return getEm().createQuery("FROM Receita r WHERE 1=1"
                    + "AND r.status = :param1")
                    .setParameter("param1", StatusPublicacao.POSTADA)
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public Receita buscarPorId(Receita t) throws Exception {
        try {
            Receita find = getEm().find(Receita.class, t.getId());
            super.close();
            return find;
        } catch (Exception e) {
            throw new ReceitaInexistenteException();
        }
    }

    @Override
    public List<Receita> buscarPorNome(String nome) {
        try {

            return getEm().createQuery("SELECT r FROM Receita r "
                    + "JOIN r.ingts i "
                    + "WHERE 1=1 "
                    + "AND r.status = :param1 "
                    + "AND ( "
                    + "UPPER(r.nome) LIKE UPPER(:param) "
                    + "OR "
                    + "UPPER(i.ingrediente.nome) LIKE UPPER(:param) "
                    + "OR "
                    + "UPPER(r.descricao) LIKE UPPER(:param) "
                    + ")"
                    + "GROUP BY r.id")
                    .setParameter("param", "%" + nome + "%")
                    .setParameter("param1", StatusPublicacao.POSTADA)
                    .setMaxResults(20)
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public List<Receita> buscarPorCategoria(CategoriaReceita categoria) {
        try {
            return getEm().createQuery("FROM Receita r WHERE 1=1"
                    + "AND r.categoria = :param "
                    + "AND r.status = :param1")
                    .setParameter("param", categoria)
                    .setParameter("param1", StatusPublicacao.POSTADA)
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public List<Receita> buscarBemAvaliadas() {
        try {
            return getEm().createQuery("SELECT av.receita FROM AvaliacaoReceita av "
                    + "WHERE 1=1 "
                    + "AND av.receita.status = :param1 "
                    + "GROUP BY  av.receita "
                    + "ORDER BY AVG(av.valor) DESC")
                    .setParameter("param1", StatusPublicacao.POSTADA)
                    .setMaxResults(16)
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

}
