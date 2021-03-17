package com.fancv.message;

import com.fancv.service.MessageAssembleService;
import com.fancv.service.MessageService;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hamish-wu
 */
@Component
@Slf4j
public class EventListener {

    @Resource
    MessageAssembleService messageAssemble;

    @Subscribe
    public void onMessage(EventMessage eventMsg) {
        int result = messageAssemble.messageAssemble(eventMsg);
        log.info("消息消费数据：result:{} message{}", result, eventMsg.getMessage().toString());
    }


    @Subscribe
    public void onMessage2(EventMessage eventMsg) {
        log.info("消息消费数据2 ： message{}", eventMsg.getMessage().toString());
    }

}
