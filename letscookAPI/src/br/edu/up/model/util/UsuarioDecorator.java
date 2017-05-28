/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.util;

import br.edu.up.model.entity.Usuario;

/**
 *
 * @author G0042204
 */
public class UsuarioDecorator {

    public Usuario criar() {
        Usuario u = new Usuario();
        u.setEmail("henmerlin@gmail.com");
        u.setSenha("d20m08");
        return u;

    }

}
