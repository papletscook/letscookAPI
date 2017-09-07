/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.DispensaUsuario;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class DispensaDAO extends AbstractHibernateDAO implements InterfaceGeladeiraDAO<DispensaUsuario> {

    @Override
    public void cadastrar(DispensaUsuario g) {
        super.persist(g);
    }

    @Override
    public void excluir(DispensaUsuario g) {
        super.remove(g);
    }

    @Override
    public DispensaUsuario editar(DispensaUsuario g) {
        super.merge(g);
        return g;
    }

    @Override
    public List<DispensaUsuario> listar() {

        try {
            return getEm().createQuery("FROM Dispensa d")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public DispensaUsuario buscarPorId(DispensaUsuario g) {
        return getEm().find(DispensaUsuario.class, g.getId());
    }

    @Override
    public DispensaUsuario buscarPorUsuario(Usuario u) {
        try {
            return (DispensaUsuario) getEm().createQuery("FROM Dispensa g WHERE g.dono = :param")
                    .setParameter("param", u)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
