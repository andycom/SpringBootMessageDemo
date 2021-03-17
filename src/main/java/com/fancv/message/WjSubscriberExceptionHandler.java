package com.fancv.message;

import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 自定义异步消息异常处理
 *
 * @author hamish-wu
 */
@Component
@Slf4j
public class WjSubscriberExceptionHandler implements SubscriberExceptionHandler {
    @Override
    public void handleException(Throwable exception, SubscriberExceptionContext context) {
        log.info("异步消息处理异常", exception);
        log.info(context.getEvent().toString());

    }
}
