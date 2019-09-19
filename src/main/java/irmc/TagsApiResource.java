package irmc;

import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class TagsApiResource implements TagsApi {

    public Map<String, Collection<Tag>> getAll(String realmId) {
        return null;
    }

    public Collection<Tag> getTaggable(String realmId, String taggableId) {
        return null;
    }

    public Map<String, Collection<Tag>> getAllTaggable(String realmId, List<String> taggableIds) {
        return null;
    }

    public Tag get(String realmId, String tagId) {
        return null;
    }

    public Response create(String realmId, Tag tag) {
        return null;
    }

    public Response update(String realmId, Tag tag) {
        return null;
    }

    public Response delete(String realmId, String tagId) {
        return null;
    }

    public Response updateTaggable(String realmId, String taggableId, Collection<String> tagIds) {
        return null;
    }

    @Override
    public Map<String, Collection<Tag>> getAll() {
        return null;
    }

    @Override
    public Response update() {
        return null;
    }
}
