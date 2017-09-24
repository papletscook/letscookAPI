/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.UnidadeMedidaEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author G0042204
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "ingrediente_receita")
public class IngredienteReceita extends AbstractEntity {

    @JoinColumn(name = "ingrediente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ingrediente ingrediente;

    @Column(name = "unidade_medida")
    @Enumerated(EnumType.STRING)
    private UnidadeMedidaEnum uMedida;

    @NotNull
    private Double quant;

    @ManyToOne(optional = false)
    @JoinColumn(name = "receita_id", nullable = false)
    private Receita receita;

    public IngredienteReceita() {
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
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

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Receita obterReceita() {
        return receita;
    }

}
