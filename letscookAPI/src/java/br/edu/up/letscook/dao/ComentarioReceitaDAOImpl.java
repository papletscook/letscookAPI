package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.ComentarioReceita;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G0042204
 */
public class ComentarioReceitaDAOImpl extends GenericHibernateDAO<ComentarioReceita> implements GenericDAO<ComentarioReceita> {

    @Override
    public List<ComentarioReceita> listar() {
        try {
            return getEm().createQuery("FROM ComentarioReceita i").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public ComentarioReceita buscarPorId(ComentarioReceita t) throws Exception {
        try {
            return getEm().find(ComentarioReceita.class, t.getId());
        } catch (Exception e) {
            throw new Exception("Comentário inexistente!");
        } finally {
            this.close();
        }
    }

}
