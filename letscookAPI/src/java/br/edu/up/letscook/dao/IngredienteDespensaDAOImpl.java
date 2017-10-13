/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.IngredienteDespensa;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class IngredienteDespensaDAOImpl extends GenericHibernateDAO<IngredienteDespensa> {

    @Override
    public List<IngredienteDespensa> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IngredienteDespensa buscarPorId(IngredienteDespensa t) throws Exception {
        try {
            return getEm().find(IngredienteDespensa.class, t.getId());
        } catch (Exception e) {
            throw new Exception("Ingrediente inexistente!");
        } finally {
            this.close();
        }
    }

}
