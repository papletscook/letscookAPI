/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.service;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.dao.InterfaceDAO;
import br.edu.up.model.entity.CategoriaReceita;

/**
 *
 * @author G0042204
 */
public class CategoriaReceitaService implements InterfaceService<CategoriaReceita>{

    private InterfaceDAO<CategoriaReceita> dao = FactoryDAO.createCategoriaReceitaDAO();

    @Override
    public void cadastrar(CategoriaReceita c) throws Exception{        
        dao.cadastrar(c);
    }

}
