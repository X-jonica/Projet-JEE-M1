
package com.example.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Henintsoa
 */
@Path("/hello")
public class HelloResource {
    
    @GET
    public Response sayHello(){
        return Response.ok("IT WORK !").build();
    }
}
