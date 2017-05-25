/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.dao;

import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface InterfaceDAO<T> {

    public void cadastrar(T t);

    public void excluir(T t);

    public T editar(T t);

    public List<T> listar(T t);

}
