package com.fancv.message;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * guava  事件总线配置
 *
 * @author hamish-wu
 */
@Configuration
public class EventBusConfig {

    @Resource
    WjSubscriberExceptionHandler wjSubscriberExceptionHandler;

    @Bean
    public EventBus eventBus() {
        return new EventBus();
    }

    /**
     * 异步处理
     *
     * @return
     */
    @Bean
    public AsyncEventBus asyncEventBus() {
        return new AsyncEventBus(new ThreadPoolExecutor(4, 8, 60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>()), wjSubscriberExceptionHandler);
    }
}
