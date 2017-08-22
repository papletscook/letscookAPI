/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.enums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
public enum UnidadeMedidaEnum {

    XICARA("xícara"),
    COLHER_SOPA("colher (sopa)"),
    COLHER_CHA("colher (chá)"),
    COLHER_SOBREMESA("colher (sobremesa)"),
    PITADA("pitada"),
    LITRO("litro"),
    MILITITRO("mililitro (ml)"),
    QUILO("quilograma (kg)"),
    GRAMA("grama (g)"),
    COPO("copo"),
    UNIDADE("unidade"),
    UNIDADE_PEQ("unidade (pequena)"),
    UNIDADE_MED("unidade (média)"),
    UNIDADE_GRD("unidade (grande)"),
    DUZIA("dúzia");

    String desc;

    private UnidadeMedidaEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public List<UnidadeMedidaEnum> solidos() {
        List<UnidadeMedidaEnum> und = new ArrayList<>();

        und.add(GRAMA);

        return und;
    }

}
