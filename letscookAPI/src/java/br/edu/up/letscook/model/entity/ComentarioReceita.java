/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.StatusPublicacao;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "comentario_usuario_receita")
public class ComentarioReceita extends AbstractEntity {

    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "conteudo")
    private String conteudo;

    @Enumerated(EnumType.STRING)
    private StatusPublicacao status;

    @Basic(optional = false)
    @NotNull
    @Column(name = "data_comentario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataComentario;

    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "receita_id", nullable = false)
    private Receita receita;

    public ComentarioReceita() {
        dataComentario = Calendar.getInstance().getTime();
        status = StatusPublicacao.POSTADA;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public StatusPublicacao getStatus() {
        return status;
    }

    public void setStatus(StatusPublicacao status) {
        this.status = status;
    }

    public Date getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
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

}
