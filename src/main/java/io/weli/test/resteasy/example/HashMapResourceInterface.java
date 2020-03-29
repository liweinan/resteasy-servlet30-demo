package io.weli.test.resteasy.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

public interface HashMapResourceInterface {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    String map(HashMap<String, String> params);
}