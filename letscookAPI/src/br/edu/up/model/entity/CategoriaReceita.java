/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */

@Entity
@Table(name = "LETSCOOK_CATEGORIA_RECEITA")
public class CategoriaReceita extends AbstractEntity{
    
    private String nome;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
    private List<Receita> receitas;

    public CategoriaReceita() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    
    

    
    
}
