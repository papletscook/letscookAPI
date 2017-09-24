package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Ingrediente;

public class FactoryService {

    public static ReceitaService createReceitaService() {
        return new ReceitaServiceImpl();
    }

    public static GenericService<CategoriaReceita> createCategoriaReceitaService() {
        return new CategoriaReceitaService();
    }

    public static DespensaService createDespensaService() {
        return new DespensaServiceImpl();
    }

    public static UsuarioService createInterfaceUsuarioService() {
        return new UsuarioServiceImpl();
    }

    public static NamedEntityService<Ingrediente> createInterfaceIngredienteService() {
        return new IngredienteServiceImpl();
    }

}
