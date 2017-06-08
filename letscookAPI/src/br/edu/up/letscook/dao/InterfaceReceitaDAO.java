/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;
import java.util.List;

/**
 *
 * @author G0042204
 * @param <Receita>
 */
public interface InterfaceReceitaDAO<Receita> extends InterfaceDAO<Receita> {

    public List<Receita> buscarPorNome(String nome);

    public List<Receita> buscarPorCategoria(CategoriaReceita categoria);

    public List<Receita> buscarPorNacionalidade(NacionalidadeEnum nasc);
    
}
