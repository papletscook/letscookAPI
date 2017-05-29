/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.dao;

import br.edu.up.model.entity.Geladeira;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class GeladeiraDAO extends AbstractHibernateDAO implements InterfaceGeladeiraDAO<Geladeira> {

    @Override
    public void cadastrar(Geladeira g) {
        super.persist(g);
    }

    @Override
    public void excluir(Geladeira g) {
        super.remove(g);
    }

    @Override
    public Geladeira editar(Geladeira g) {
        super.merge(g);
        return g;
    }

    @Override
    public List<Geladeira> listar(Geladeira g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Geladeira buscarPorId(Geladeira g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
