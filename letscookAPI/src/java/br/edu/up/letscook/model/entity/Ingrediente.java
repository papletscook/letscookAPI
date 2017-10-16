/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.TipoIngrediente;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "ingrediente")
public class Ingrediente extends AbstractNamedEntity {

    @Enumerated(EnumType.STRING)
    private TipoIngrediente tipo;

    @Lob
    @Column(columnDefinition = "LONG")
    private String foto;

    public Ingrediente() {
    }

    public TipoIngrediente getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngrediente tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object obj) {
        return Long.compare(((Ingrediente) obj).getId(), this.getId()) == 0;
    }

}
