/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonBackReference;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_PASSO_ETAPA")
public class PassoEtapa extends AbstractEntity {

    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Etapa etapa;

    public PassoEtapa() {
    }

    public PassoEtapa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

}
