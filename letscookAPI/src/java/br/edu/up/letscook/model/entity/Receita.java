/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "receita")
public class Receita extends PublicEntity {

    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CategoriaReceita categoria;

    @NotNull
    private String descricao;

    @NotNull
    private Integer minsPreparo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receita", fetch = FetchType.EAGER, orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<IngredienteReceita> ingts;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receita", fetch = FetchType.EAGER, orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<EtapaReceita> etapas;

    @OneToMany(mappedBy = "receita", fetch = FetchType.EAGER, orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<ComentarioReceita> comentarios;

    @OneToMany(mappedBy = "receita", fetch = FetchType.EAGER, orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<AvaliacaoReceita> avaliacoes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "criador_id", referencedColumnName = "id")
    private Usuario criador;

    @NotNull
    @Column(name = "data_publicacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPublicacao;

    @NotNull
    @Column(name = "data_atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    @Lob
    @Column(columnDefinition = "LONG")
    private String imagem;

    @Transient
    private Double score;

    public Receita() {
    }

    public void adicionarIngrediente(IngredienteReceita i) {
        i.setReceita(this);
        getIngts().add(i);
    }

    public void adicionarEtapa(EtapaReceita e) {
        e.setReceita(this);
        e.setOrdem(getEtapas().size() + 1);
        getEtapas().add(e);
    }

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaReceita categoria) {
        this.categoria = categoria;
    }

    public Integer getMinsPreparo() {
        return minsPreparo;
    }

    public void setMinsPreparo(Integer minsPreparo) {
        this.minsPreparo = minsPreparo;
    }

    public List<EtapaReceita> getEtapas() {
        if (etapas == null) {
            etapas = new ArrayList<>();
        }
        return etapas;
    }

    public void setEtapas(List<EtapaReceita> etapas) {
        for (int i = 0; i < etapas.size(); i++) {
            etapas.get(i).setOrdem(i + 1);
            etapas.get(i).setReceita(this);
        }
        this.etapas = etapas;
    }

    public Usuario getCriador() {
        return criador;
    }

    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

    public List<IngredienteReceita> getIngts() {
        if (ingts == null) {
            ingts = new ArrayList<>();
        }
        return ingts;
    }

    public void setIngts(List<IngredienteReceita> ingts) {
        ingts.forEach((t) -> {
            t.setReceita(this);
        });
        this.ingts = ingts;
    }

    public void addScore(Double score) {
        this.score += score;
    }

    public List<AvaliacaoReceita> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoReceita> avalicoes) {
        avalicoes.forEach((t) -> {
            t.setReceita(this);
        });
        this.avaliacoes = avalicoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ComentarioReceita> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioReceita> comentarios) {
        comentarios.forEach((t) -> {
            t.setReceita(this);
        });
        this.comentarios = comentarios;
    }

    @Override
    public boolean equals(Object obj) {
        return Long.compare(((Receita) obj).getId(), this.getId()) == 0;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

}
