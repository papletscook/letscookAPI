package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.Receita;

public class FactoryService {

    public static ReceitaService<Receita> createReceitaService() {
        return new ReceitaServiceImpl();
    }

    public static GenericService<CategoriaReceita> createCategoriaReceitaService() {
        return new CategoriaReceitaService();
    }

    public static DespensaService<DespensaUsuario> createInterfaceGeladeiraService() {
        return new DespensaServiceImpl();
    }

    public static UsuarioService createInterfaceUsuarioService() {
        return new UsuarioServiceImpl();
    }
    
    public static GenericService<Ingrediente>  createInterfaceIngredienteService() {
        return new IngredienteServiceImpl();
    }

}
