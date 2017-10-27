/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.dao.exception.UsuarioSemDespensaException;
import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.ListaCompras;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;

public class ListaComprasDAOImpl extends GenericHibernateDAO<ListaCompras> implements ListaComprasDAO {

    @Override
    public List<ListaCompras> listar() {
        try {
            return getEm().createQuery("FROM ListaCompras i").getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

    @Override
    public ListaCompras buscarPorId(ListaCompras t) throws Exception {
        try {
            return getEm().find(ListaCompras.class, t.getId());
        } catch (Exception e) {
            throw new Exception("Lista inexistente!");
        } finally {
            this.close();
        }
    }

    @Override
    public List<ListaCompras> buscarPorUsuario(Usuario u) throws Exception {
        try {
            return getEm().createQuery("FROM ListaCompras g WHERE g.usuario = :param")
                    .setParameter("param", u)
                    .getResultList();
        } catch (NoResultException e) {
            return new ArrayList<>();
        } finally {
            this.close();
        }
    }

}
