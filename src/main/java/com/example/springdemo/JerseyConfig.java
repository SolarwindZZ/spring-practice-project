package com.example.springdemo;
import com.example.springdemo.resource.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("")
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig(){
        register(UserResource.class);   //register添加资源类
    }
}
