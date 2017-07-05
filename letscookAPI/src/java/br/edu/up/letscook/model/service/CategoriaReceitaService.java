/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceDAO;
import br.edu.up.letscook.model.entity.CategoriaReceita;
import java.util.List;

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
        return dao.editar(t);
    }

    @Override
    public void excluir(CategoriaReceita t) {
        dao.excluir(t);
    }

    @Override
    public CategoriaReceita buscarPorId(CategoriaReceita t) {
        return dao.buscarPorId(t);
    }

    @Override
    public List<CategoriaReceita> listar() {
        return dao.listar();
    }
    
    
    

}
