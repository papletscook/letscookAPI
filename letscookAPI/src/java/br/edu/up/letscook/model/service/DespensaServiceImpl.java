/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;
import br.edu.up.letscook.dao.DespensaDAO;
import br.edu.up.letscook.dao.UsuarioDAO;
import br.edu.up.letscook.dao.exception.UsuarioSemDespensaException;

/**
 *
 * @author G0042204
 */
public class DespensaServiceImpl implements DespensaService {

    private DespensaDAO<DespensaUsuario> dao = FactoryDAO.createInterfaceGeladeiraDAO();

    public DespensaServiceImpl() {
    }

    @Override
    public void cadastrar(DespensaUsuario t) throws Exception {
        dao.cadastrar(t);
    }

    @Override
    public DespensaUsuario editar(DespensaUsuario t) {
        return dao.editar(t);
    }

    @Override
    public void excluir(DespensaUsuario t) {
        dao.excluir(t);
    }

    @Override
    public DespensaUsuario buscarPorUsuario(Usuario u) throws Exception {
        UsuarioDAO uDAO = FactoryDAO.createUsuarioDAO();
        try {
            u = uDAO.buscarPorId(u);
            return dao.buscarPorUsuario(u);
        } catch (UsuarioSemDespensaException e) {
            DespensaUsuario d = new DespensaUsuario();
            d.setDono(u);
            u.setDespensa(d);
            dao.cadastrar(d);
            return d;
        }
    }

    @Override
    public DespensaUsuario buscarPorId(DespensaUsuario t) throws Exception {
        return dao.buscarPorId(t);
    }

    @Override
    public List<DespensaUsuario> listar() {
        return dao.listar();
    }

}
