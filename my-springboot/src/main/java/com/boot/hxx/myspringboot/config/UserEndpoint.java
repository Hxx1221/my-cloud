package com.boot.hxx.myspringboot.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by boss on 2019/9/21 17:42
 */
@Component
@Endpoint(id = "user")
public class UserEndpoint {
    @ReadOperation
    public List<Map<String, Object>> health() {
        final List<Map<String,Object>> objects = new ArrayList<>();
        final HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("name", 1);
        objects.add(stringObjectHashMap);
        return objects;


    }

}
