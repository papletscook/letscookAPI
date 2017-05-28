package br.edu.up.model.service;

import br.edu.up.model.entity.Receita;

public class FactoryService {

    public static InterfaceService<Receita> createReceitaService() {
        return new ReceitaService();
    }

}
