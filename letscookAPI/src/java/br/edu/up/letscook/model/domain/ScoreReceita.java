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

    private Double scoreTotal;

    private Double compt;

    public ScoreReceita() {
        this.score = 0d;
        this.scoreTotal = 0d;
        this.compt = 0d;
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

    public void addScore(Double score) {
        this.score += score;
    }

    public void addScoreTotal(Double scoreTotal) {
        this.scoreTotal += scoreTotal;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(Double scoreTotal) {
        this.scoreTotal = scoreTotal;
    }

    public Double getCompt() {
        return this.score / this.scoreTotal;
    }

    public void setCompt(Double compt) {
        this.compt = compt;
    }

}
