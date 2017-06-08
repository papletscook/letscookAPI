/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceDAO;
import br.edu.up.letscook.model.entity.CategoriaReceita;

/**
 *
 * @author G0042204
 */
public class CategoriaReceitaService implements InterfaceService<CategoriaReceita> {

    private InterfaceDAO<CategoriaReceita> dao = FactoryDAO.createCategoriaReceitaDAO();

    @Override
    public void cadastrar(CategoriaReceita c) throws Exception {
        dao.cadastrar(c);
    }

    @Override
    public CategoriaReceita editar(CategoriaReceita t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(CategoriaReceita t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaReceita buscarPorId(CategoriaReceita t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
