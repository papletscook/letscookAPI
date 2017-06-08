package br.edu.up.letscook.model.service;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Geladeira;
import br.edu.up.letscook.model.entity.Receita;

public class FactoryService {

    public static InterfaceReceitaService<Receita> createReceitaService() {
        return new ReceitaService();
    }

    public static InterfaceService<CategoriaReceita> createCategoriaReceitaService() {
        return new CategoriaReceitaService();
    }
    
    public static InterfaceGeladeiraService<Geladeira> createInterfaceGeladeiraService(){
        return new GeladeiraService();
    }

}
