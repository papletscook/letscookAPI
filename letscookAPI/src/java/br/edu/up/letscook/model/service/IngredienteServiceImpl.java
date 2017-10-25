/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.service;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.GenericNewDAO;
import br.edu.up.letscook.dao.exception.IngredienteInexistenteException;
import br.edu.up.letscook.model.entity.Ingrediente;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class IngredienteServiceImpl extends AbstractServiceImpl<Ingrediente> implements NamedEntityService<Ingrediente> {

    private final GenericNewDAO<Ingrediente> dao = FactoryDAO.createInterfaceIngredienteDAO();

    @Override
    public void cadastrar(Ingrediente t) throws Exception {
        try {
            dao.buscarPorNome(t);
            throw new Exception("Ingrediente já cadastrado!");
        } catch (IngredienteInexistenteException e) {
            dao.cadastrar(t);
        }
    }

    @Override
    public Ingrediente editar(Ingrediente t) {
        return dao.editar(t);
    }

    @Override
    public void excluir(Ingrediente t) {
        dao.excluir(t);
    }

    @Override
    public Ingrediente buscarPorId(Ingrediente t) throws Exception {
        return dao.buscarPorId(t);
    }

    @Override
    public List<Ingrediente> listarPorNome(String nome) {
        return dao.listarPorNomeAproximado(nome);
    }

    @Override
    public List<Ingrediente> listar() {
        return dao.listar();
    }

}
