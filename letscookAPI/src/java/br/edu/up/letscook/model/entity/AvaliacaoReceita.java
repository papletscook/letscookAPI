/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "avaliacao_usuario_receita")
public class AvaliacaoReceita extends AbstractEntity {

    @NotNull
    @Column(name = "valor")
    private Long valor;

    @NotNull
    @Column(name = "data_avaliacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAvaliacao;

    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "receita_id", nullable = false)
    private Receita receita;

    public AvaliacaoReceita() {
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Date dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Receita obterReceita() {
        return this.receita;
    }

}
