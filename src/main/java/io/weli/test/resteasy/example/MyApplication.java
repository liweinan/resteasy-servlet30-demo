package io.weli.test.resteasy.example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;

@ApplicationPath("/")
public class MyApplication extends Application {
    HashSet<Object> singletons = new HashSet<Object>();

    public MyApplication() {
        singletons.add(new FooResource());

    }

}
