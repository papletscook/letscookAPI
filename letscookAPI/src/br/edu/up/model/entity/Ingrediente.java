/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.entity;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author G0042204
 */
@MappedSuperclass
public abstract class Ingrediente extends AbstractEntity {

    private String nome;

    public Ingrediente() {
    }

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
