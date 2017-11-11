package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.AvaliacaoReceita;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G0042204
 */
public class AvaliacaoReceitaDAOImpl extends GenericHibernateDAO<AvaliacaoReceita> implements AvaliacaoReceitaDAO {

    @Override
    public List<AvaliacaoReceita> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AvaliacaoReceita buscarPorId(AvaliacaoReceita t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AvaliacaoReceita buscarAvaliacaoUsuarioReceita(AvaliacaoReceita a) throws Exception {
        try {
            Query query = getEm().createQuery("FROM AvaliacaoReceita a WHERE 1=1"
                    + "AND a.usuario = :param "
                    + "AND a.receita = :param1");
            query.setParameter("param", a.getUsuario());
            query.setParameter("param1", a.obterReceita());

            return (AvaliacaoReceita) query.getSingleResult();
        } catch (NoResultException e) {
            throw new Exception("Avaliação inexistente!");
        } finally {
            this.close();
        }
    }

}
