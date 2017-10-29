/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import br.edu.up.letscook.dao.FactoryDAO;
import br.edu.up.letscook.dao.GenericDAO;
import br.edu.up.letscook.model.entity.AvaliacaoReceita;
import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.ComentarioReceita;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.service.AvaliacaoReceitaService;
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
import br.edu.up.letscook.model.service.ReceitaService;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;

/**
 *
 * @author G0042204
 */
@Path("/receita")
public class ReceitaController implements InterfaceNamedRest<Receita> {

    private ReceitaService serv;

    public ReceitaController() {
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response cadastrar(Receita r) {
        try {
            serv = FactoryService.createReceitaService();
            serv.cadastrar(r);
            return Response.status(Status.OK).entity(r).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("/avaliar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response avaliar(AvaliacaoReceita r) {
        try {
            AvaliacaoReceitaService srv = FactoryService.createAvaliacaoReceitaService();
            srv.cadastrar(r);
            return Response.status(Status.OK).entity(r).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("/comentar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response comentar(ComentarioReceita r) {
        try {
            GenericDAO<ComentarioReceita> dao = FactoryDAO.createComentarioReceitaDAO();
            dao.cadastrar(r);
            return Response.status(Status.OK).entity(r).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response get(@PathParam("id") Long id) {
        try {
            serv = FactoryService.createReceitaService();
            Receita r = new Receita();
            r.setId(id);
            return Response.status(Status.OK).entity(serv.buscarPorId(r)).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("buscarPorNome")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response listarPorNome(String nome) {
        try {
            serv = FactoryService.createReceitaService();
            Receita r = new Receita();
            r.setNome(nome);
            return Response.status(Status.OK).entity(serv.buscarPorNome(nome)).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("buscarPorCategoria")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response buscarPorCategoria(CategoriaReceita cat) {
        try {
            serv = FactoryService.createReceitaService();
            return Response.status(Status.OK).entity(serv.buscarPorCategoria(cat)).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("buscarBemAvaliadas")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON) 
    public Response buscarBemAvaliadas() {
        try {
            serv = FactoryService.createReceitaService();
            return Response.status(Status.OK).entity(serv.buscarBemAvaliadas()).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Override
    public Response atualizar(Receita t) {
        try {
            serv = FactoryService.createReceitaService();
            return Response.status(Status.OK).entity(serv.editar(t)).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @POST
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(CategoriaReceita cat) {
        try {
            serv = FactoryService.createReceitaService();
            return Response.status(Status.OK).entity(serv.buscarPorCategoria(cat)).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response remover(@PathParam("id") Long id) {
        try {
            serv = FactoryService.createReceitaService();
            Receita r = new Receita();
            r.setId(id);
            serv.excluir(r);
            return Response.status(Status.OK).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @Override
    public Response list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
