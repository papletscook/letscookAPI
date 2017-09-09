/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "item_lista")
public class ItemLista extends AbstractNamedEntity {

    private Boolean checked;

    public ItemLista() {
        checked = false;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

}
