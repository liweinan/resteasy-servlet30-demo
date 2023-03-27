package io.weli.test.resteasy.example;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;

@ApplicationPath("/app")
public class MyApplication extends Application {

// 去掉下面的也可以
//    HashSet<Object> singletons = new HashSet<Object>();
//
//    public MyApplication() {
//        singletons.add(new FooResource());
//
//    }

}
