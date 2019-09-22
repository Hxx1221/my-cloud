package com.springstarter.hxx.springbootstarterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by boss on 2019/9/21 20:17
 */
@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
