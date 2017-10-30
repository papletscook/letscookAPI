/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;
import br.edu.up.letscook.dao.UsuarioDAO;
import br.edu.up.letscook.dao.exception.UsuarioInexistenteException;
import java.util.Calendar;

/**
 *
 * @author G0042204
 */
public class UsuarioServiceImpl implements GenericService<Usuario>, UsuarioService {

    private UsuarioDAO dao = FactoryDAO.createUsuarioDAO();

    public UsuarioServiceImpl() {
    }

    @Override
    public void cadastrar(Usuario t) throws Exception {
        t.setDataCriacao(Calendar.getInstance().getTime());
        t.setImagem("imagem");
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
    public Usuario buscarPorId(Usuario t) throws Exception{
        return dao.buscarPorId(t);
    }

    @Override
    public Boolean verificarCredencial(Usuario u) throws Exception {
        return dao.buscarPorEmail(u).getSenha().equals(u.getSenha());
    }

    @Override
    public List<Usuario> listar() {
        return dao.listar();
    }

    @Override
    public Usuario buscarPorEmail(Usuario u) throws UsuarioInexistenteException {
        return dao.buscarPorEmail(u);
    }

}
