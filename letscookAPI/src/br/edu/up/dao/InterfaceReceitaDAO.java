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
 * @param <Receita>
 */
public interface InterfaceReceitaDAO<Receita> extends InterfaceDAO<Receita> {
    public List<Receita> buscarPorNome(String nome);
}
