package com.github.andrejpetras.todo.core.rs;

import com.github.andrejpetras.todo.core.dao.Todo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.UUID;

@Path("todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoRestController {

    @GET
    public Response findAll() {
        var tmp = Todo.findAll().list();
        return Response.ok(tmp).build();
    }

    @POST
    public Response create(String text) {
        Todo t = new Todo();
        t.id = UUID.randomUUID().toString();
        t.text = text;
        t.persistAndFlush();
        return Response.ok(t.id).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(String id) {
        var tmp = Todo.deleteById(id);
        if (tmp) {
            return Response.ok().build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

}
