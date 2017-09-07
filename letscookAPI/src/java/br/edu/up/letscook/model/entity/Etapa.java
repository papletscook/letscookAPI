/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "LETSCOOK_ETAPA_RECEITA")
public class Etapa extends AbstractNamedEntity {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "PASSOS_FK"))
    private List<PassoEtapa> passos;

    public Etapa() {
        passos = new ArrayList<>();
    }

    public void adicionarPasso(PassoEtapa p) {
        passos.add(p);
    }

    public List<PassoEtapa> getPassos() {
        return passos;
    }

    public void setPassos(List<PassoEtapa> passos) {
        this.passos = passos;
    }

}
