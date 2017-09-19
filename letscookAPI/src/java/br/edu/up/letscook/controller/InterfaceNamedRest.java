/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import javax.ws.rs.core.Response;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface InterfaceNamedRest<T> extends InterfaceRest<T>{

    public Response listarPorNome(String nome);

}
