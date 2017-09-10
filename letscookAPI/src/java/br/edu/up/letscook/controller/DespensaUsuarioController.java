/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import br.edu.up.letscook.model.entity.DespensaUsuario;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.service.DespensaService;
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

/**
 *
 * @author G0042204
 */
@Path("/despensa")
public class DespensaUsuarioController implements InterfaceRest<DespensaUsuario> {

    private DespensaService serv;

    public DespensaUsuarioController() {
    }

    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response cadastrar(DespensaUsuario r) {
        try {
            serv = FactoryService.createDespensaService();
            serv.cadastrar(r);
            return Response.status(Status.OK).entity(r).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("atualizar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response atualizar(DespensaUsuario r) {
        try {
            serv = FactoryService.createDespensaService();
            serv.editar(r);
            return Response.status(Status.OK).entity(r).build();
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
            serv = FactoryService.createDespensaService();
            DespensaUsuario r = new DespensaUsuario();
            r.setId(id);
            return Response.status(Status.OK).entity(serv.buscarPorId(r)).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("remover")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response remover(DespensaUsuario i) {
        try {
            serv = FactoryService.createDespensaService();
            serv.excluir(i);
            return Response.status(Status.OK).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response list() {
        try {
            serv = FactoryService.createDespensaService();
            return Response.status(Status.OK).entity(serv.listar()).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

}
