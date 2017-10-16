/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.domain;

import br.edu.up.letscook.model.entity.Receita;

/**
 *
 * @author G0042204
 */
public class ScoreReceita {

    private Receita receita;

    private Double score;

    public ScoreReceita() {
        this.score = 0d;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Double getScore() {
        return score;
    }
    
    public void addScore(Double score){
        this.score += score;
        System.out.println("add");
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
