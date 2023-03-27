package io.weli.test.resteasy.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/foo")
public class FooResource {
    @GET
    public String get() {
        return "Hello, world!";
    }
}
