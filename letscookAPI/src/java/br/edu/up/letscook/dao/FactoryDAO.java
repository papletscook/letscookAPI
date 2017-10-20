package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.ComentarioReceita;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.Receita;

public class FactoryDAO {

    public static UsuarioDAO createUsuarioDAO() {
        return new UsuarioDAOImpl();
    }

    public static IngredienteReceitaDAO createIngredienteReceitaDAO() {
        return new IngredienteReceitaDAOImpl();
    }

    public static GenericDAO<Receita> createReceitaDAO() {
        return new ReceitaDAOmpl();
    }

    public static ReceitaDAO createInterfaceReceitaDAO() {
        return new ReceitaDAOmpl();
    }

    public static GenericNewDAO<CategoriaReceita> createCategoriaReceitaDAO() {
        return new CategoriaReceitaDAOImpl();
    }

    public static AvaliacaoReceitaDAO createAvaliacaoReceitaDAO() {
        return new AvaliacaoReceitaDAOImpl();
    }

    public static DespensaDAO createInterfaceGeladeiraDAO() {
        return new DespensaDAOImpl();
    }

    public static GenericNewDAO<Ingrediente> createInterfaceIngredienteDAO() {
        return new IngredienteDAOImpl();
    }

    public static GenericDAO<ComentarioReceita> createComentarioReceitaDAO() {
        return new ComentarioReceitaDAOImpl();
    }

}
