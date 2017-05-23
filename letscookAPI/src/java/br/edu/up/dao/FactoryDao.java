package br.edu.up.dao;

import br.edu.up.entity.Usuario;

public class FactoryDao {

    public static InterfaceDAO<Usuario> createUsuarioDAO() {
        return new UsuarioDAO();
    }

}
