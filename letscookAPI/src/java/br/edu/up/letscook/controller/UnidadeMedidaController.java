/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller;

import br.edu.up.letscook.model.dto.UnidadeMedidaDTO;
import br.edu.up.letscook.model.enums.UnidadeMedidaEnum;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0042204
 */
@Path("/unidadeMedida")
public class UnidadeMedidaController {

    public UnidadeMedidaController() {
    }

    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        try {
            List<UnidadeMedidaDTO> lst = new ArrayList<>();
            for (UnidadeMedidaEnum v : UnidadeMedidaEnum.values()) {
                lst.add(new UnidadeMedidaDTO(v));
            }
            return Response.status(Status.OK).entity(lst).build();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

}
