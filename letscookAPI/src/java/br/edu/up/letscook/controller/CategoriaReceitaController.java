/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.service.FactoryService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import br.edu.up.letscook.model.service.GenericService;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;

/**
 *
 * @author G0042204
 */
@Path("/categoriaReceita")
public class CategoriaReceitaController implements InterfaceNamedRest<CategoriaReceita> {

    private GenericService<CategoriaReceita> serv;

    public CategoriaReceitaController() {
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response cadastrar(CategoriaReceita u) {
        try {
            serv = FactoryService.createCategoriaReceitaService();
            serv.cadastrar(u);
            return Response.status(Status.OK).entity(u).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response get(@PathParam("id") Long id) {
        try {
            serv = FactoryService.createCategoriaReceitaService();
            CategoriaReceita r = new CategoriaReceita();
            r.setId(id);
            return Response.status(Status.OK).entity(serv.buscarPorId(r)).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response atualizar(CategoriaReceita r) {
        try {
            serv = FactoryService.createCategoriaReceitaService();
            serv.editar(r);
            return Response.status(Status.OK).entity(r).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response list() {
        try {
            serv = FactoryService.createCategoriaReceitaService();
            return Response.status(Status.OK).entity(serv.listar()).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response remover(@PathParam("id") Long id) {
        try {
            serv = FactoryService.createCategoriaReceitaService();
            CategoriaReceita i = new CategoriaReceita();
            i.setId(id);
            serv.excluir(i);
            return Response.status(Status.OK).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @Override
    public Response listarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
