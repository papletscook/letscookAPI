/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.service;

import br.edu.up.model.entity.Usuario;

/**
 *
 * @author G0042204
 * @param <Receita>
 */
public interface InterfaceGeladeiraService<Geladeira> extends InterfaceService<Geladeira> {

    public Geladeira buscarPorUsuario(Usuario u);

}
