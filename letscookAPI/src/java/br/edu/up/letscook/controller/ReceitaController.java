/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.service.FactoryService;
import br.edu.up.letscook.model.service.InterfaceService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author G0042204
 */
@Path("/receita")
public class ReceitaController {

    private InterfaceService<Receita> serv = FactoryService.createReceitaService();

    public ReceitaController() {
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Receita cadastrar(Receita r) {
        try {
            serv.cadastrar(r);
            return r;
        } catch (Exception e) {
            return null;
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Receita getReceita(@PathParam("id") int id) {
        Receita r = new Receita();
        r.setId(new Long(id));
        return serv.buscarPorId(r);
    }

}
