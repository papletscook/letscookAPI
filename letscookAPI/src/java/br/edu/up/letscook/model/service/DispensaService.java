/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceGeladeiraDAO;
import br.edu.up.letscook.model.entity.DispensaUsuario;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class DispensaService implements InterfaceDispensaService<DispensaUsuario> {
    
    private InterfaceGeladeiraDAO<DispensaUsuario> dao = FactoryDAO.createInterfaceGeladeiraDAO();
    
    
    public DispensaService() {
    }
    
    @Override
    public void cadastrar(DispensaUsuario t) throws Exception {
        dao.cadastrar(t);
    }
    
    @Override
    public DispensaUsuario editar(DispensaUsuario t) {
        return dao.editar(t);
    }
    
    @Override
    public void excluir(DispensaUsuario t) {
        dao.excluir(t);
    }

    @Override
    public DispensaUsuario buscarPorUsuario(Usuario u) {
        return dao.buscarPorUsuario(u);
    }

    @Override
    public DispensaUsuario buscarPorId(DispensaUsuario t) {
        return dao.buscarPorId(t);
    }

    @Override
    public List<DispensaUsuario> listar() {
        return dao.listar();
    }
    
    
    
}
