/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.service;

import br.edu.up.dao.FactoryDAO;
import br.edu.up.dao.InterfaceGeladeiraDAO;
import br.edu.up.model.entity.Geladeira;

/**
 *
 * @author G0042204
 */
public class GeladeiraService implements InterfaceGeladeiraService<Geladeira> {

    private InterfaceGeladeiraDAO<Geladeira> dao = FactoryDAO.createInterfaceGeladeiraDAO();

    public GeladeiraService() {
    }

    @Override
    public void cadastrar(Geladeira t) throws Exception {
        dao.cadastrar(t);
    }

    @Override
    public Geladeira editar(Geladeira t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Geladeira t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

}
