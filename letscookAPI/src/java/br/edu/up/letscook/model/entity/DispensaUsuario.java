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
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_DISPENSA_USUARIO")
public class DispensaUsuario extends AbstractEntity {

    @OneToOne(targetEntity = Usuario.class)
    private Usuario dono;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "LETSCOOK_INGREDIENTE_DISPENSA",
            joinColumns = @JoinColumn(name = "id"))
    private List<IngredienteDispensa> ings;

    public DispensaUsuario() {
        ings = new ArrayList<>();
    }

    public void adicionarIngredientes(IngredienteDispensa g) {
        ings.add(g);
    }

    public Usuario getDono() {
        return dono;
    }

    public void setDono(Usuario dono) {
        this.dono = dono;
    }

    public List<IngredienteDispensa> getIngs() {
        return ings;
    }

    public void setIngs(List<IngredienteDispensa> ings) {
        this.ings = ings;
    }

}
