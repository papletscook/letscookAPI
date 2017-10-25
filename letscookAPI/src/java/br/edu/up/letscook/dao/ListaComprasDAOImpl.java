/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.ListaCompras;
import java.util.ArrayList;
import java.util.List;

public class ListaComprasDAOImpl extends GenericHibernateDAO<ListaCompras> implements GenericDAO<ListaCompras> {

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

}
