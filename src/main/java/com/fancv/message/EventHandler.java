package com.fancv.message;

import com.google.common.eventbus.EventBus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

/**
 * @author hamish-wu
 */
@Component
@Slf4j
public class EventHandler {
    @Autowired
    private EventBus eventBus;

    @Autowired
    private EventListener eventListener;

    /**
     * 初始化注册事件subscriber
     */

    @PostConstruct
    public void init() {
        eventBus.register(eventListener);
    }

    /**
     * 销毁事件subscriber
     */

    @PreDestroy
    public void destroy() {
        eventBus.unregister(eventListener);
    }

    /**
     * 向event bus传递消息
     */

    public void eventPost(Integer templateType, Map message) {
        eventBus.post(EventMessage.builder().message(message).templateId(templateType).build());
    }

    public void eventPost(EventMessage eventMessage) {
        eventBus.post(eventMessage);
    }

}
