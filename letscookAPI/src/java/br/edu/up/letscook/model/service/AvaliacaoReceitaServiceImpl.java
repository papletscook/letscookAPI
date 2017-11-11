/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.AvaliacaoReceitaDAO;
import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.model.entity.AvaliacaoReceita;
import java.util.Calendar;
import java.util.List;

public class AvaliacaoReceitaServiceImpl implements AvaliacaoReceitaService {

    private final AvaliacaoReceitaDAO dao = FactoryDAO.createAvaliacaoReceitaDAO();

    @Override
    public void cadastrar(AvaliacaoReceita t) throws Exception {
        t.setDataAvaliacao(Calendar.getInstance().getTime());
        try {
            AvaliacaoReceita av = dao.buscarAvaliacaoUsuarioReceita(t);
            t.setId(av.getId());
            dao.editar(t);
        } catch (Exception e) {
            dao.cadastrar(t);
        }
    }

    @Override
    public AvaliacaoReceita editar(AvaliacaoReceita t) {
        return dao.editar(t);
    }

    @Override
    public void excluir(AvaliacaoReceita t) {
        dao.excluir(t);
    }

    @Override
    public List<AvaliacaoReceita> listar() {
        return dao.listar();
    }

    @Override
    public AvaliacaoReceita buscarPorId(AvaliacaoReceita t) throws Exception {
        return dao.buscarPorId(t);
    }

}
