package br.edu.up.letscook.dao;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Dispensa;
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

    public static InterfaceGeladeiraDAO<Dispensa> createInterfaceGeladeiraDAO() {
        return new GeladeiraDAO();
    }

    public static InterfaceIngredienteDAO createInterfaceIngredienteDAO() {
        return new IngredienteDAO();
    }

}
