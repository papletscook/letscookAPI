/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.Usuario;

/**
 *
 * @author G0042204
 */
public interface UsuarioService extends GenericService<Usuario> {

    public Boolean verificarCredencial(Usuario u) throws Exception;

}
