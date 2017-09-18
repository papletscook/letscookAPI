/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import br.edu.up.letscook.model.enums.TipoPasso;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "passo_etapa")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PassoEtapa extends AbstractEntity {

    @NotNull
    private String desc;

    @NotNull
    private String dica;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoPasso tipo;

    private Double minPasso;

    @NotNull
    private Integer ordem;

    public PassoEtapa() {
        tipo = TipoPasso.NORMAL;
    }

    public PassoEtapa(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TipoPasso getTipo() {
        return tipo;
    }

    public void setTipo(TipoPasso tipo) {
        this.tipo = tipo;
    }

    public Double getMinPasso() {
        return minPasso;
    }

    public void setMinPasso(Double minPasso) {
        this.minPasso = minPasso;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

}
