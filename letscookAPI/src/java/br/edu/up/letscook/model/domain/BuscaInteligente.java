/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.domain;

import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.Receita;
import java.util.List;

/**
 *
 * @author G0042204
 */
public interface BuscaInteligente {

    public List<Receita> buscarPorIngredientes(List<Ingrediente> ir);
}
