/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author G0042204
 */
public class RestApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public RestApplication() {
        singletons.add(new ReceitaController());
        singletons.add(new UsuarioController());
        singletons.add(new IngredienteController());
        singletons.add(new CategoriaReceitaController());
        singletons.add(new DespensaUsuarioController());     
        singletons.add(new UnidadeMedidaController());     
        
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

    public Set<Class<?>> getEmpty() {
        return empty;
    }

}
