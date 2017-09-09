/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import dev.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "status")
    private String status;

    @Basic(optional = false)
    @NotNull
    @Column(name = "data_comentario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataComentario;

    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public ComentarioReceita() {
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
    }

    public br.edu.up.letscook.model.entity.Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(br.edu.up.letscook.model.entity.Usuario usuario) {
        this.usuario = usuario;
    }

}
