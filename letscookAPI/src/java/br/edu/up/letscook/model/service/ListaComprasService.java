/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.ListaCompras;
import br.edu.up.letscook.model.entity.Usuario;
import java.util.List;

/**
 *
 * @author G0042204
 */
public interface ListaComprasService extends GenericService<ListaCompras> {

    public List<ListaCompras> buscarPorUsuario(Usuario u) throws Exception;

}
