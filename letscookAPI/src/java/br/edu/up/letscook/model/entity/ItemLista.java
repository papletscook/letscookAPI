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
import javax.persistence.Transient;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "item_lista")
public class ItemLista extends AbstractNamedEntity {

    private Boolean checked;

    @ManyToOne(optional = false)
    @JoinColumn(name = "lista_compras_id", nullable = false)
    private ListaCompras lista;

    public ItemLista() {
        checked = false;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public void setLista(ListaCompras lista) {
        this.lista = lista;
    }

}
