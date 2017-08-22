/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.enums;

/**
 *
 * @author G0042204
 */
public enum TipoIngrediente {

    SOLIDO("Sólido"), LIQUIDO("Líquido");

    String desc;

    private TipoIngrediente(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
