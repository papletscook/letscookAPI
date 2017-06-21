package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Geladeira;
import br.edu.up.letscook.model.entity.IngredienteGeladeira;
import br.edu.up.letscook.model.entity.Receita;

public class FactoryDAO {

    public static InterfaceUsuarioDAO createUsuarioDAO() {
        return new UsuarioDAO();
    }

    public static InterfaceDAO<Receita> createReceitaDAO() {
        return new ReceitaDAO();
    }

    public static InterfaceReceitaDAO<Receita> createInterfaceReceitaDAO() {
        return new ReceitaDAO();
    }

    public static InterfaceDAO<CategoriaReceita> createCategoriaReceitaDAO() {
        return new CategoriaReceitaDAO();
    }

    public static InterfaceGeladeiraDAO<Geladeira> createInterfaceGeladeiraDAO() {
        return new GeladeiraDAO();
    }

    public static InterfaceDAO<IngredienteGeladeira> createInterfaceDAOIngredienteDAO() {
        return new IngredienteDAO();
    }

}
