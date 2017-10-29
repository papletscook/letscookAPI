/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Receita;
import java.util.List;

/**
 *
 * @author G0042204
 */
public interface ReceitaService extends GenericService<Receita> {

    public List<Receita> buscarPorNome(String nome);

    public List<Receita> buscarPorCategoria(CategoriaReceita cat);

    public List<Receita> buscarBemAvaliadas();

}
