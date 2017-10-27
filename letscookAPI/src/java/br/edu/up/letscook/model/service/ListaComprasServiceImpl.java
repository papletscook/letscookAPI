/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.ListaComprasDAO;
import br.edu.up.letscook.model.entity.ListaCompras;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.Calendar;
import java.util.List;

public class ListaComprasServiceImpl implements ListaComprasService {

    private ListaComprasDAO dao = FactoryDAO.createListaComprasDAO();
    
    @Override
    public List<ListaCompras> buscarPorUsuario(Usuario u) throws Exception {
        return dao.buscarPorUsuario(u);
    }

    @Override
    public void cadastrar(ListaCompras t) throws Exception {
        t.setDataCriacao(Calendar.getInstance().getTime());
        dao.cadastrar(t);
    }

    @Override
    public void excluir(ListaCompras t) {
        dao.excluir(t);
    }

    @Override
    public ListaCompras editar(ListaCompras t) {
        return dao.editar(t);
    }

    @Override
    public List<ListaCompras> listar() {
        return dao.listar();
    }

    @Override
    public ListaCompras buscarPorId(ListaCompras t) throws Exception {
        return dao.buscarPorId(t);
    }

}
