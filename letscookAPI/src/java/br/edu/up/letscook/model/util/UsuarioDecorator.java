/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.util;

import br.edu.up.letscook.model.entity.Usuario;
import java.util.Calendar;

/**
 *
 * @author G0042204
 */
public class UsuarioDecorator {

    public static Usuario criar() {
        Usuario u = new Usuario();
        u.setEmail("henmerlin@gmail.com");
        u.setSenha("e8d95a51f3af4a3b134bf6bb680a213a");
        u.setDataNasc(Calendar.getInstance().getTime());
        return u;

    }

}
