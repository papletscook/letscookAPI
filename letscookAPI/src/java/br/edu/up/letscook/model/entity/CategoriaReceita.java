/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author G0042204
 */
@Entity
@Table(name = "categoria_receita")
public class CategoriaReceita extends AbstractNamedEntity {

    public CategoriaReceita() {
    }

}
