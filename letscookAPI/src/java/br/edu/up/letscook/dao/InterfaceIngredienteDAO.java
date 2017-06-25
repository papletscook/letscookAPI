/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.Ingrediente;
import java.util.List;

/**
 *
 * @author G0042204
 */
public interface InterfaceIngredienteDAO extends InterfaceDAO<Ingrediente> {

    public List<Ingrediente> buscarPorNome(String nome);

}
