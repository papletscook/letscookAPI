/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_INGREDIENTE_DISPENSA")
public class IngredienteDispensa extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "INGREDIENTE_ID")
    private Ingrediente i;

    public IngredienteDispensa() {
    }

    public Ingrediente getI() {
        return i;
    }

    public void setI(Ingrediente i) {
        this.i = i;
    }

}
