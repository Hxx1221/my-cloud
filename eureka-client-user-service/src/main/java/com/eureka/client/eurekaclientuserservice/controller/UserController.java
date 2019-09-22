package com.eureka.client.eurekaclientuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boss on 2019/9/22 2:26
 */
@RestController
public class UserController {


    @GetMapping("/user/hello")
    public String hello() {
        return "hello";

    }


}
