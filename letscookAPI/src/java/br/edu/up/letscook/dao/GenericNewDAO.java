/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.dao.exception.FalhaAoCadastrarException;
import java.util.List;

/**
 *
 * @author G0042204
 * @param <T>
 */
public interface GenericNewDAO<T> {

    public void cadastrar(T t) throws FalhaAoCadastrarException;

    public void excluir(T t);

    public T editar(T t);

    public List<T> listar();

    public T buscarPorId(T t) throws Exception;

    public T buscarPorNome(T t) throws Exception;

    public List<T> listarPorNomeAproximado(String nome);

}
