package com.boot.hxx.myspringboot.controller;

import com.springstarter.hxx.springbootstarterdemo.config.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boss on 2019/9/21 20:30
 */
@RestController
public class UserController {
    @Autowired
    private UserClient userClient;

    @GetMapping("/user/name")
    public String getName() {

        return userClient.getName();
    }

}
