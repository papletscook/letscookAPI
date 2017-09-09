package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.Receita;

public class FactoryDAO {

    public static UsuarioDAO createUsuarioDAO() {
        return new UsuarioDAOImpl();
    }

    public static GenericDAO<Receita> createReceitaDAO() {
        return new ReceitaDAOmpl();
    }

    public static ReceitaDAO<Receita> createInterfaceReceitaDAO() {
        return new ReceitaDAOmpl();
    }

    public static GenericDAO<CategoriaReceita> createCategoriaReceitaDAO() {
        return new CategoriaReceitaDAO();
    }

    public static DespensaDAO<DespensaUsuario> createInterfaceGeladeiraDAO() {
        return new DespensaDAOImpl();
    }

    public static NamedEntityDAO<Ingrediente> createInterfaceIngredienteDAO() {
        return new IngredienteDAOImpl();
    }

}
