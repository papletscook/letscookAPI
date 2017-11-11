/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao.exception;

/**
 *
 * @author G0042204
 */
public class UsuarioSemDespensaException extends Exception {

    public UsuarioSemDespensaException() {
        super("Usuário sem Despensa!");
    }

}
