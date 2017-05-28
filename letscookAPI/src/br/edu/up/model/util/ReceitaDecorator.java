/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.model.util;

import br.edu.up.model.entity.Etapa;
import br.edu.up.model.entity.Receita;

/**
 *
 * @author G0042204
 */
public class ReceitaDecorator {

    public Receita criarBolo() {
        Receita r = new Receita();
        
        r.setNome("TORTA DE MARACUJÁ");
        
        
        Etapa e = new Etapa();
        e.setNome("Base");
        
        
        
        
        r.adicionarEtapa(e);
        
        
        
        return r;
    }

}
