/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.dao.exception.UsuarioInexistenteException;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class UsuarioDAOImpl extends GenericHibernateDAO<Usuario> implements UsuarioDAO {

    @Override
    public List<Usuario> listar() {
        try {
            return getEm().createQuery("FROM Usuario r")
                    .getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public Usuario buscarPorId(Usuario t) {
        return getEm().find(Usuario.class, t.getId());
    }

    @Override
    public Usuario buscarPorEmail(Usuario u) throws UsuarioInexistenteException {
        try {
            return (Usuario) getEm().createQuery("FROM Usuario WHERE UPPER(email) = UPPER(:param1)")
                    .setParameter("param1", u.getEmail()).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            throw new UsuarioInexistenteException();
        } finally {
            this.close();
        }
    }

}
