package br.edu.up.dao;

import br.edu.up.model.entity.Receita;
import br.edu.up.model.entity.Usuario;

public class FactoryDAO {

    public static InterfaceDAO<Usuario> createUsuarioDAO() {
        return new UsuarioDAO();
    }

    public static InterfaceDAO<Receita> createReceitaDAO() {
        return new ReceitaDAO();
    }

}
