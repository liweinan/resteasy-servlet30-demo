package irmc;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/tags/{realm-id}")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public interface TagsApi {

    @GET
    Map<String, Collection<Tag>> getAll();

    @POST
    Response update();


//    @GET
//    @Path("/taggable/{id}")
//    Collection<Tag> getTaggable(@PathParam("realm-id") String realmId, @PathParam("id") String taggableId);
//
//
//    @PUT
//    @Path("/taggable/{id}")
//    Response updateTaggable(@PathParam("realm-id") String realmId, @PathParam("id") String taggableId, Collection<String> tagIds);


//    @POST
//    @Path("/taggable/get-all")
//    Map<String, Collection<Tag>> getAllTaggable(@PathParam("realm-id") String realmId, List<String> taggableIds);
//
//    @GET
//    @Path("/{id}")
//    Tag get(@PathParam("realm-id") String realmId, @PathParam("id") String tagId);

//
//    @DELETE
//    @Path("/{tag-id}")
//    Response delete(@PathParam("realm-id") String realmId, @PathParam("tag-id") String tagId);
//

}