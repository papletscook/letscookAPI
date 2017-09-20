/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.dto;

import br.edu.up.letscook.model.enums.UnidadeMedidaEnum;

/**
 *
 * @author G0042204
 */
public class UnidadeMedidaDTO {

    private UnidadeMedidaEnum name;
    private String desc;
    private Double escala;

    public UnidadeMedidaDTO(UnidadeMedidaEnum e) {
        this.name = e;
        this.desc = e.getDesc();
        this.escala = e.getEscala();
    }

    public UnidadeMedidaEnum getName() {
        return name;
    }

    public void setName(UnidadeMedidaEnum name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getEscala() {
        return escala;
    }

    public void setEscala(Double escala) {
        this.escala = escala;
    }

}
