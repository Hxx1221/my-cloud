package com.boot.hxx.myspringboot.interfaces;

import com.springstarter.hxx.springbootstarterdemo.config.UserAutoConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by boss on 2019/9/21 20:55
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {
}
