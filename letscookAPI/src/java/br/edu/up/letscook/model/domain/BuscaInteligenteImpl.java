/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.domain;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.IngredienteReceitaDAO;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import br.edu.up.letscook.model.entity.Receita;
import java.util.List;

public class BuscaInteligenteImpl implements BuscaInteligente {


    @Override
    public List<Receita> buscarPorIngredientes(List<Ingrediente> ir) {
        IngredienteReceitaDAO dao = FactoryDAO.createIngredienteReceitaDAO();
        
        List<IngredienteReceita> lst = dao.listarPorIngredientes(ir);

        
        return null;
    }

}
