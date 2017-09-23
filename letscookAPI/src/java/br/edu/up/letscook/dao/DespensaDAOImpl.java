/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class DespensaDAOImpl extends GenericHibernateDAO<DespensaUsuario> implements DespensaDAO<DespensaUsuario> {

    @Override
    public List<DespensaUsuario> listar() {
        try {
            return getEm().createQuery("FROM DespensaUsuario d")
                    .getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            this.close();
        }
    }

    @Override
    public DespensaUsuario buscarPorId(DespensaUsuario g) {
        try {
            return getEm().find(DespensaUsuario.class, g.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            this.close();
        }
    }

    @Override
    public DespensaUsuario buscarPorUsuario(Usuario u) {
        try {
            return (DespensaUsuario) getEm().createQuery("FROM DespensaUsuario g WHERE g.dono = :param")
                    .setParameter("param", u)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            this.close();
        }
    }

}
