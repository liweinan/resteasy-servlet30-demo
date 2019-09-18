package dev.isikemre.test.irmc;

import irmc.Tag;
import irmc.TagsApi;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertNull;

// https://issues.jboss.org/browse/RESTEASY-2335
public class TagsApiIT {

    @Test
    @Disabled
    void testGet() {
        TagsApi tagsApi = RestClientBuilder.newBuilder().baseUri(URI.create("http://localhost:8080")).build(TagsApi.class);
        Tag tag = tagsApi.get("some-thing", "some-id");

        assertNull(tag);
    }

}
