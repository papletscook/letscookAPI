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

    XICARA("xícara", 25d),
    COLHER_SOPA("colher (sopa)", 25d),
    COLHER_CHA("colher (chá)", 25d),
    COLHER_SOBREMESA("colher (sobremesa)", 25d),
    PITADA("pitada", 10d),
    LITRO("litro", 25d),
    MILITITRO("mililitro (ml)", 5d),
    QUILO("quilograma (kg)", 50d),
    GRAMA("grama (g)", 15d),
    COPO("copo", 50d),
    UNIDADE("unidade", 50d),
    UNIDADE_PEQ("unidade (pequena)", 25d),
    UNIDADE_MED("unidade (média)", 100d),
    UNIDADE_GRD("unidade (grande)", 150d),
    DUZIA("dúzia", 1000d);

    String desc;
    Double escala;

    private UnidadeMedidaEnum(String desc, Double escala) {
        this.desc = desc;
        this.escala = escala;
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
