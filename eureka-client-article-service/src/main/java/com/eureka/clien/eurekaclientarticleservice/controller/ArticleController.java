package com.eureka.clien.eurekaclientarticleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by boss on 2019/9/22 2:42
 */
@RestController
public class ArticleController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/article/callHello")
    public String hello() {
        final ResponseEntity<String> forEntity = restTemplate.getForEntity("http://127.0.0.1:8081/user/hello", String.class);
        return forEntity.getBody();
    }


    @GetMapping("/article/callHello2")
    public String hello2() {
        final ResponseEntity<String> forEntity = restTemplate.getForEntity("http://eureka-client-user-service/user/hello", String.class);
        return forEntity.getBody();
    }

}
