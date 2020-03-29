package io.weli.test.resteasy.example;


import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.stream.Collectors;

@Path("/map")
public class HashMapResource implements HashMapResourceInterface {
    @POST
    public String map(HashMap<String, String> params) {
        return params.keySet().stream()
                .map(key -> key + "=" + params.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
    }

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/app/map");
        ResteasyWebTarget rtarget = (ResteasyWebTarget) target;

        HashMapResourceInterface mapResource = rtarget.proxy(HashMapResourceInterface.class);
        mapResource.map(new HashMap<String, String>() {{
            put("answer", "42");
        }});

    }
}