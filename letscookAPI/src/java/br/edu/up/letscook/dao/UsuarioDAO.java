/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class UsuarioDAO extends AbstractHibernateDAO implements InterfaceDAO<Usuario> {

    @Override
    public void cadastrar(Usuario t) {
        super.persist(t);
    }

    @Override
    public void excluir(Usuario t) {
        super.remove(t);
    }

    @Override
    public Usuario editar(Usuario t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<Usuario> listar(Usuario t) {
        try {
            return em.createQuery("FROM Usuario r")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Usuario buscarPorId(Usuario t) {
        return em.find(Usuario.class, t.getId());
    }

}
