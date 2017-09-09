/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import java.util.List;

/**
 *
 * @author G0042204
 */
public interface NamedEntityDAO<T> extends GenericDAO<T>{
    
    public List<T> listarPorNome(String nome);
    
}
