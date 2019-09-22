package com.boot.hxx.myspringboot.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * Created by boss on 2019/9/21 17:38
 */
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(final Health.Builder builder) throws Exception {
        builder.up().withDetail("status",true);
    }
}
