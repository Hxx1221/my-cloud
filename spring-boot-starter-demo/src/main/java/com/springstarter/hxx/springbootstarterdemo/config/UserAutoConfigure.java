package com.springstarter.hxx.springbootstarterdemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by boss on 2019/9/21 20:22
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {


    @Bean
    @ConditionalOnProperty(prefix = "spring.user",value = "enabled",havingValue = "true")
    public UserClient userClient(UserProperties userProperties) {
        return new UserClient(userProperties);

    }


}
