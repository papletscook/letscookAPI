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
public enum NacionalidadeEnum {

    AFGHAN("Afeganistão"),
    SOUTH_AFRICAN("África do Sul"),
    ALBANIAN("Albânia"),
    BRASIL("Brasil");

    private String nome;

    private NacionalidadeEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
