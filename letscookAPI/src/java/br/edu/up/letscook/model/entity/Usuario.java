/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.GeneroEnum;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author G0042204
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "usuario")
public class Usuario extends AbstractNamedImageEntity {

    private String email, senha, descricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNasc;

    @OneToOne(mappedBy = "dono")
    private DespensaUsuario despensa;

    @NotNull
    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "genero")
    private GeneroEnum genero;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER, orphanRemoval = true)
    @Fetch(FetchMode.SELECT)
    private List<ListaCompras> listaCompras;

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setDespensa(DespensaUsuario despensa) {
        this.despensa = despensa;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

//    public List<ListaCompras> getListaCompras() {
//        return listaCompras;
//    }

    public void setListaCompras(List<ListaCompras> listaCompras) {
        listaCompras.forEach((t) -> {
            t.setUsuario(this);
        });
        this.listaCompras = listaCompras;
    }

}
