/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.StatusPublicacao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author G0042204
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Receita extends AbstractNamedEntity {

    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CategoriaReceita categoria;

    @NotNull
    private String descricao;

    @Lob
    @Column(columnDefinition = "LONG")
    private String foto;

    @NotNull
    private Integer minsPreparo;

    @Enumerated(EnumType.STRING)
    private StatusPublicacao status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receita")
    private List<IngredienteReceita> ingts;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "receita")
    private List<EtapaReceita> etapas;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "criador_id", referencedColumnName = "id")
    private Usuario criador;

    public Receita() {
        status = StatusPublicacao.DESATIVADA;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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
        etapas.forEach((t) -> {
            t.setReceita(this);
            t.setOrdem(etapas.indexOf(t) + 1);
        });
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
        this.ingts = ingts;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPublicacao getStatus() {
        return status;
    }

    public void setStatus(StatusPublicacao status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        return Long.compare(((Receita) obj).getId(), this.getId()) == 0;
    }

}
