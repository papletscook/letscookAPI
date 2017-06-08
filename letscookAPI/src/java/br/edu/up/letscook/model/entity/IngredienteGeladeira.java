/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_INGREDIENTE_GELADEIRA")
public class IngredienteGeladeira extends Ingrediente {

    @ManyToOne
    private Geladeira geladeira;

    public IngredienteGeladeira() {
    }

    public Geladeira getGeladeira() {
        return geladeira;
    }

    public void setGeladeira(Geladeira geladeira) {
        this.geladeira = geladeira;
    }

}
