package com.boot.hxx.myspringboot.async;

import com.boot.hxx.myspringboot.error.GlobalExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by boss on 2019/9/21 18:10
 */
@Configuration
public class AsyncTaskExecutePool implements AsyncConfigurer {

    @Autowired
    private TaskThreadPoolConfig config;

    final Logger logger = LoggerFactory.getLogger(AsyncTaskExecutePool.class);

    @Override
    public Executor getAsyncExecutor() {

        final ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(config.getCorePoolSize());
        threadPoolTaskExecutor.setMaxPoolSize(config.getMaxPoolSize());
        threadPoolTaskExecutor.setQueueCapacity(config.getQueueCapacity());
        threadPoolTaskExecutor.setKeepAliveSeconds(config.getKeepAliveSeconds());
        threadPoolTaskExecutor.setThreadNamePrefix(config.getThreadNamePrefix());
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncUncaughtExceptionHandler() {
            @Override
            public void handleUncaughtException(final Throwable throwable, final Method method, final Object... objects) {

                logger.error("===================" + throwable.getMessage() + "================");

                logger.error("exception method:" + method.getName());

            }
        };


    }
}
