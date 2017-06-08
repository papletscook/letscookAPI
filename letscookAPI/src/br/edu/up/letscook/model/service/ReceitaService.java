/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.InterfaceReceitaDAO;
import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class ReceitaService implements InterfaceReceitaService<Receita> {

    private InterfaceReceitaDAO<Receita> dao = FactoryDAO.createInterfaceReceitaDAO();

    @Override
    public void cadastrar(Receita r) throws Exception {

        if (r.getIngts().isEmpty() || r.getEtapas().isEmpty()) {
            throw new ServiceException("RN002 - Validação de receitas");
        }
        dao.cadastrar(r);
    }

    @Override
    public List<Receita> buscarPorNome(String nome) {
        return dao.buscarPorNome(nome);
    }

    @Override
    public List<Receita> buscarPorNacionalidade(NacionalidadeEnum nasc) {
        return dao.buscarPorNacionalidade(nasc);
    }

    @Override
    public List<Receita> buscarPorCategoria(CategoriaReceita cat) {
        return dao.buscarPorCategoria(cat);
    }

    @Override
    public Receita editar(Receita t) {
        return dao.editar(t);
    }

    @Override
    public void excluir(Receita t) {
        dao.excluir(t);
    }

    @Override
    public Receita buscarPorId(Receita t) {
        return dao.buscarPorId(t);
    }
    
    

}
