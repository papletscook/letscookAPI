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
@Table(name = "ingrediente_despensa")
public class IngredienteDespensa extends AbstractEntity {

    @JoinColumn(name = "ingrediente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ingrediente ingrediente;

    public IngredienteDespensa() {
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

}
