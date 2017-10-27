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

    public static UsuarioService createUsuarioService() {
        return new UsuarioServiceImpl();
    }

    public static AvaliacaoReceitaService createAvaliacaoReceitaService() {
        return new AvaliacaoReceitaServiceImpl();
    }

    public static NamedEntityService<Ingrediente> createInterfaceIngredienteService() {
        return new IngredienteServiceImpl();
    }
    
    public static ListaComprasService createListaComprasService(){
        return new ListaComprasServiceImpl();
    }

}
