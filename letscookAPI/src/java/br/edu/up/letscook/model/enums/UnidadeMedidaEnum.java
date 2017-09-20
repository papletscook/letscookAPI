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
public enum UnidadeMedidaEnum {

    XICARA("xícara(s)", 25d),
    COLHER_SOPA("colher(es) (sopa)", 25d),
    COLHER_CHA("colher(es) (chá)", 25d),
    COLHER_SOBREMESA("colher(es) (sobremesa)", 25d),
    PITADA("pitada(s)", 10d),
    LITRO("litro(s)", 25d),
    MILITITRO("mililitro(s) (ml)", 5d),
    QUILO("quilograma(s) (kg)", 50d),
    GRAMA("grama(s) (g)", 15d),
    COPO("copo(s)", 50d),
    UNIDADE("unidade(s)", 50d),
    UNIDADE_PEQ("unidade(s) (pequena)", 25d),
    UNIDADE_MED("unidade(s) (média)", 100d),
    UNIDADE_GRD("unidade(s) (grande)", 150d),
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

    public Double getEscala() {
        return escala;
    }

}
