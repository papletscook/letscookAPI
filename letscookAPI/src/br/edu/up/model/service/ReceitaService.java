/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.service;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.dao.InterfaceDAO;
import br.edu.up.model.entity.Receita;

/**
 *
 * @author G0042204
 */
public class ReceitaService implements InterfaceService<Receita>{

    private InterfaceDAO<Receita> dao = FactoryDAO.createReceitaDAO();

    @Override
    public void cadastrar(Receita r) throws Exception{
        
        if(r.getIngts().isEmpty() || r.getEtapas().isEmpty()){
            throw new ServiceException("RN002 - Validação de receitas");
        }      
        
        dao.cadastrar(r);
        
    }

}
