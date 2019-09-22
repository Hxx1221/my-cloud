package com.boot.hxx.myspringboot.error;

import org.bouncycastle.asn1.ocsp.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:He_xixiang
 * @Title: ${enclosing_method}
 * @Description: ${todo}(这里用一句话描述这个方法的作用)
 * @return ${return_type}    返回类型
 * @date: $DATE
 * @throws
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map defaultErroHandler(HttpServletRequest req, Exception e) {
        logger.error("", e);

        Map<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("message", e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            objectObjectHashMap.put("code", 404);

        } else {
            objectObjectHashMap.put("code", 500);

        }
        return objectObjectHashMap;
    }
}
