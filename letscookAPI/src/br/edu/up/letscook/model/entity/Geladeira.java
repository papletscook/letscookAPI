/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_GELADEIRA_USUARIO")
public class Geladeira extends AbstractEntity {

    @OneToOne
    private Usuario dono;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "geladeira", cascade = CascadeType.PERSIST)
    private List<IngredienteGeladeira> ings;

    public Geladeira() {
        ings = new ArrayList<>();
    }

    public void adicionarIngredientes(IngredienteGeladeira g) {
        ings.add(g);
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public List<IngredienteGeladeira> getIngs() {
        return ings;
    }

    public void setIngs(List<IngredienteGeladeira> ings) {
        this.ings = ings;
    }

}
