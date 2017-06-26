package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Dispensa;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.Receita;

public class FactoryService {

    public static InterfaceReceitaService<Receita> createReceitaService() {
        return new ReceitaService();
    }

    public static InterfaceService<CategoriaReceita> createCategoriaReceitaService() {
        return new CategoriaReceitaService();
    }

    public static InterfaceDispensaService<Dispensa> createInterfaceGeladeiraService() {
        return new DispensaService();
    }

    public static InterfaceUsuarioService createInterfaceUsuarioService() {
        return new UsuarioService();
    }
    
    public static InterfaceService<Ingrediente>  createInterfaceIngredienteService() {
        return new IngredienteService();
    }

}
