/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_ITEM_RECEITA")
public class ItemReceita extends AbstractEntity{
    
    @ManyToOne
    private IngredienteReceita ingr;
    
    private Double qtde;
    
    private UnidadeMedidaEnum uMedida;

    public ItemReceita() {
    }

    public IngredienteReceita getIngr() {
        return ingr;
    }

    public void setIngr(IngredienteReceita ingr) {
        this.ingr = ingr;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    public UnidadeMedidaEnum getuMedida() {
        return uMedida;
    }

    public void setuMedida(UnidadeMedidaEnum uMedida) {
        this.uMedida = uMedida;
    }
    
    
    
    
}
