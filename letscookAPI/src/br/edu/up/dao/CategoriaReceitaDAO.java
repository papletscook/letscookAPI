/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.dao;

import br.edu.up.model.entity.CategoriaReceita;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class CategoriaReceitaDAO extends AbstractHibernateDAO implements InterfaceDAO<CategoriaReceita> {

    @Override
    public void cadastrar(CategoriaReceita t) {
        super.persist(t);
    }

    @Override
    public void excluir(CategoriaReceita t) {
        super.remove(t);
    }

    @Override
    public CategoriaReceita editar(CategoriaReceita t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<CategoriaReceita> listar(CategoriaReceita t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaReceita buscarPorId(CategoriaReceita t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
