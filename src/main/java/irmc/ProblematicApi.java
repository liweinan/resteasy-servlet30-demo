package irmc;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/{realm-id}/bad/")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public interface ProblematicApi {

    @POST
    @Path("/foo/{id}")
    String bad(@PathParam("realm-id") String realmId, @PathParam("id") String id);

}
