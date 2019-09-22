package com.springstarter.hxx.springbootstarterdemo.config;

/**
 * Created by boss on 2019/9/21 20:19
 */
public class UserClient {
    private UserProperties userProperties;

    public UserClient(final UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public UserClient() {
    }

    public String getName() {

        return userProperties.getName();

    }

}
