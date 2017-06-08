/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model;

import br.edu.up.letscook.model.entity.IngredienteGeladeira;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author G0042204
 */
public class Tomate extends IngredienteGeladeira {

    public Tomate() {
        this.setNome("Tomate");
    }

}
