package io.weli.test.resteasy.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/foo")
public class FooResource {
    @GET
    public String get() {
        return "Hello, world!";
    }
}
