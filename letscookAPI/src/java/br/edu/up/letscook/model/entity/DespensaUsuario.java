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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "despensa_usuario")
public class DespensaUsuario extends AbstractEntity {

    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario dono;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "despensa_usuario_id", referencedColumnName = "id")
    private List<IngredienteDespensa> ings;

    public DespensaUsuario() {
        ings = new ArrayList<>();
    }

    public void adicionarIngredientes(IngredienteDespensa g) {
        ings.add(g);
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public List<IngredienteDespensa> getIngs() {
        return ings;
    }

    public void setIngs(List<IngredienteDespensa> ings) {
        this.ings = ings;
    }

}
