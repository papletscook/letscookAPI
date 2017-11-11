/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import java.util.List;

/**
 *
 * @author G0042204
 */
public interface NamedEntityService<T> extends GenericService<T> {

    public List<T> listarPorNome(String nome);

}
