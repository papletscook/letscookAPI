/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.UnidadeMedidaEnum;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "ingrediente_receita")
public class IngredienteReceita extends AbstractEntity {

    @JoinColumn(name = "ingrediente_id", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Ingrediente i;

    @Column(name = "unidade_medida")
    @Enumerated(EnumType.STRING)
    private UnidadeMedidaEnum uMedida;

    @NotNull
    private Double quant;

    public IngredienteReceita() {
    }

    public Ingrediente getI() {
        return i;
    }

    public void setI(Ingrediente i) {
        this.i = i;
    }

    public UnidadeMedidaEnum getuMedida() {
        return uMedida;
    }

    public void setuMedida(UnidadeMedidaEnum uMedida) {
        this.uMedida = uMedida;
    }

    public Double getQuant() {
        return quant;
    }

    public void setQuant(Double quant) {
        this.quant = quant;
    }

}
