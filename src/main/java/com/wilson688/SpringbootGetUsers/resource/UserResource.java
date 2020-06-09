package com.wilson688.SpringbootGetUsers.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import com.wilson688.SpringbootGetUsers.model.Users;


/*
 Search for User information by userId
 */

@Path("/company/users")
public class UserResource {


    @GET
    @Path("/{id}")
    public Users getUser(String id) {
        return null;
    }

}
