/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.service;

import br.edu.up.model.entity.CategoriaReceita;
import br.edu.up.model.enums.NacionalidadeEnum;
import java.util.List;

/**
 *
 * @author G0042204
 * @param <Receita>
 */
public interface InterfaceReceitaService<Receita> extends InterfaceService<Receita> {

    public List<Receita> buscarPorNome(String nome);

    public List<Receita> buscarPorNacionalidade(NacionalidadeEnum nasc);

    public List<Receita> buscarPorCategoria(CategoriaReceita cat);

}
