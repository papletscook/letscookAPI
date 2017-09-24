/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.domain.filter;

import br.edu.up.letscook.model.entity.Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public abstract class IngredienteFilter implements Filter<Ingrediente> {

    private List<Ingrediente> retorno;

    public List<Ingrediente> getRetorno() {
        if (retorno == null) {
            retorno = new ArrayList<>();
        }
        return retorno;
    }

    @Override
    public List<Ingrediente> filter(List<Ingrediente> param) {
        param.forEach((t) -> {
            if (criteria(t)) {
                getRetorno().add(t);
            }
        });

        return getRetorno();
    }

    protected abstract Boolean criteria(Ingrediente i);

}
