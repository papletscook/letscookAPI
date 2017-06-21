/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceDAO;
import br.edu.up.letscook.model.entity.Usuario;

/**
 *
 * @author G0042204
 */
public class UsuarioService implements InterfaceService<Usuario>, InterfaceUsuarioService {

    private InterfaceDAO<Usuario> dao = FactoryDAO.createUsuarioDAO();

    public UsuarioService() {
    }

    @Override
    public void cadastrar(Usuario t) throws Exception {
        dao.cadastrar(t);
    }

    @Override
    public Usuario editar(Usuario t) {
        return dao.editar(t);
    }

    @Override
    public void excluir(Usuario t) {
        dao.excluir(t);
    }

    @Override
    public Usuario buscarPorId(Usuario t) {
        return dao.buscarPorId(t);
    }

    @Override
    public Boolean verificarCredencial(Usuario u) throws Exception {
        // Casting 
        u.setSenha(u.getSenha());
        return this.buscarPorId(u).getSenha().equals(u.getSenha());
    }

}
