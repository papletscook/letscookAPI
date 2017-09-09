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
public class DespensaDAOImpl extends AbstractHibernateDAO implements DespensaDAO<DespensaUsuario> {

    @Override
    public void cadastrar(DespensaUsuario g) {
        super.persist(g);
    }

    @Override
    public void excluir(DespensaUsuario g) {
        super.remove(g);
    }

    @Override
    public DespensaUsuario editar(DespensaUsuario g) {
        super.merge(g);
        return g;
    }

    @Override
    public List<DespensaUsuario> listar() {

        try {
            return getEm().createQuery("FROM Dispensa d")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public DespensaUsuario buscarPorId(DespensaUsuario g) {
        return getEm().find(DespensaUsuario.class, g.getId());
    }

    @Override
    public DespensaUsuario buscarPorUsuario(Usuario u) {
        try {
            return (DespensaUsuario) getEm().createQuery("FROM Dispensa g WHERE g.dono = :param")
                    .setParameter("param", u)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
