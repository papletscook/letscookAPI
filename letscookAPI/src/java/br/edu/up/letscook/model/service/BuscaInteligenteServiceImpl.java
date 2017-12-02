/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.IngredienteReceitaDAO;
import br.edu.up.letscook.model.service.filter.Filter;
import br.edu.up.letscook.model.service.filter.IngredienteExistentesFilter;
import br.edu.up.letscook.model.service.filter.IngredienteInexistentesFilter;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import br.edu.up.letscook.model.entity.Receita;
import java.util.ArrayList;
import java.util.List;

public class BuscaInteligenteServiceImpl implements BuscaInteligenteService {

    @Override
    public List<ScoreReceita> buscarPorIngredientes(List<Ingrediente> ir) {
        IngredienteReceitaDAO dao = FactoryDAO.createIngredienteReceitaDAO();
        List<IngredienteReceita> lst = dao.listarPorIngredientes(ir);

        List<ScoreReceita> scores = new ArrayList<>();
        List<Receita> rList = new ArrayList<>();

        lst.forEach((IngredienteReceita t) -> {
            if (!rList.contains(t.obterReceita())) {
                rList.add(t.obterReceita());
            }
        });

        rList.forEach((t) -> {
            scores.add(this.calcularScore(t, ir));
        });

        return scores;
    }

    @Override
    public ScoreReceita calcularScore(Receita r, List<Ingrediente> ir) {
        ScoreReceita score = new ScoreReceita();
        score.setReceita(r);

        List<Ingrediente> receita = new ArrayList<>();
        r.getIngts().forEach((t) -> {
            receita.add(t.getIngrediente());
        });

        receita.forEach((t) -> {
            IngredienteReceita ing = this.buscarIngrediente(r, t);
            score.addScoreTotal(100 + (ing.getQuant() * ing.getuMedida().getEscala()));
        });

        /**
         * Existentes
         */
        Filter<Ingrediente> existentes = new IngredienteExistentesFilter(receita);
        existentes.filter(ir).forEach((Ingrediente t) -> {
            IngredienteReceita ing = this.buscarIngrediente(r, t);
            if (ing != null) {
                score.addScore(100 + (ing.getQuant() * ing.getuMedida().getEscala()));
            }
        });

        /**
         * Inexistentes
         */
        Filter<Ingrediente> inexi = new IngredienteInexistentesFilter(receita);
        inexi.filter(ir).forEach((Ingrediente t) -> {
            IngredienteReceita ing = this.buscarIngrediente(r, t);
//            System.out.println("ing");
            if (ing != null) {
                score.addScore(-100 - (ing.getQuant() * ing.getuMedida().getEscala()));
            }
        });
        
        return score;
    }

    public IngredienteReceita buscarIngrediente(Receita r, Ingrediente ing) {
        for (IngredienteReceita ingt : r.getIngts()) {
            if (ingt.getIngrediente().equals(ing)) {
                return ingt;
            }
        }
        return null;
    }

}
