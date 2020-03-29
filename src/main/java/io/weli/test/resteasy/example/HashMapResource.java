package io.weli.test.resteasy.example;


import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.stream.Collectors;

@Path("/map")
public class HashMapResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void map(HashMap<String, String> params) {
        System.out.println(params.keySet().stream()
                .map(key -> key + "=" + params.get(key))
                .collect(Collectors.joining(", ", "{", "}")));
    }

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("http://localhost:8080/app/map");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        builder.post(Entity.entity(new HashMap() {{
            put("answer", "42");
        }}, MediaType.APPLICATION_JSON));
    }
}