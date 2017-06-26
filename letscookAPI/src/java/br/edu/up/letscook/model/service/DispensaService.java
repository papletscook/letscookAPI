/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceGeladeiraDAO;
import br.edu.up.letscook.model.entity.Dispensa;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class DispensaService implements InterfaceDispensaService<Dispensa> {
    
    private InterfaceGeladeiraDAO<Dispensa> dao = FactoryDAO.createInterfaceGeladeiraDAO();
    
    
    public DispensaService() {
    }
    
    @Override
    public void cadastrar(Dispensa t) throws Exception {
        dao.cadastrar(t);
    }
    
    @Override
    public Dispensa editar(Dispensa t) {
        return dao.editar(t);
    }
    
    @Override
    public void excluir(Dispensa t) {
        dao.excluir(t);
    }

    @Override
    public Dispensa buscarPorUsuario(Usuario u) {
        return dao.buscarPorUsuario(u);
    }

    @Override
    public Dispensa buscarPorId(Dispensa t) {
        return dao.buscarPorId(t);
    }

    @Override
    public List<Dispensa> listar() {
        return dao.listar();
    }
    
    
    
}
