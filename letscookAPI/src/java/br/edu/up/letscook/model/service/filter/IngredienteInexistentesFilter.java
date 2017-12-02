/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service.filter;

import br.edu.up.letscook.model.entity.Ingrediente;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class IngredienteInexistentesFilter extends IngredienteFilter {

    private List<Ingrediente> comp;

    public IngredienteInexistentesFilter(List<Ingrediente> comp) {
        this.comp = comp;
    }

    @Override
    protected Boolean criteria(Ingrediente i) {
        return !comp.contains(i);
    }

}
