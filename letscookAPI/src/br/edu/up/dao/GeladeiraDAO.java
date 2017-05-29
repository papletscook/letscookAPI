/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.dao;

import br.edu.up.model.entity.Geladeira;
import br.edu.up.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class GeladeiraDAO extends AbstractHibernateDAO implements InterfaceGeladeiraDAO<Geladeira> {

    @Override
    public void cadastrar(Geladeira g) {
        super.persist(g);
    }

    @Override
    public void excluir(Geladeira g) {
        super.remove(g);
    }

    @Override
    public Geladeira editar(Geladeira g) {
        super.merge(g);
        return g;
    }

    @Override
    public List<Geladeira> listar(Geladeira g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Geladeira buscarPorId(Geladeira g) {
        return em.find(Geladeira.class, g.getId());
    }

    @Override
    public Geladeira buscarPorUsuario(Usuario u) {
        try {
            return (Geladeira) em.createQuery("FROM Geladeira g WHERE g.dono = :param")
                    .setParameter("param", u)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
