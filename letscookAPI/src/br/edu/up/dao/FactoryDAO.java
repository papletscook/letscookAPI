package br.edu.up.dao;

import br.edu.up.model.entity.CategoriaReceita;
import br.edu.up.model.entity.Geladeira;
import br.edu.up.model.entity.Receita;
import br.edu.up.model.entity.Usuario;

public class FactoryDAO {

    public static InterfaceDAO<Usuario> createUsuarioDAO() {
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

}
