package com.fancv.service.impl;

import com.fancv.entity.PO.WjCrmMessage;
import com.fancv.message.EventMessage;
import com.fancv.message.MessageTemplate;
import com.fancv.service.MessageAssembleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author hamish-wu
 */
@Component
@Log4j2
public class MessageAssembleServiceImpl implements MessageAssembleService {


  /*  @Autowired
    WjCrmMessageMapper wjCrmMessageMapper;*/

    /**
     * 组装消息
     *
     * @param
     * @return
     */
    @Override
    public Integer messageAssemble(EventMessage eventMessage) {
        Map<String, String> message = eventMessage.getMessage();

        String messageContent = getMailText(message, eventMessage.getTemplateId());
        WjCrmMessage wjCrmMessage = new WjCrmMessage();
        wjCrmMessage.setMessageContent(messageContent);
        wjCrmMessage.setPublishTime(LocalDateTime.now());
        wjCrmMessage.setName(eventMessage.getName());
        wjCrmMessage.setTitle(MessageTemplate.getEnumByCode(eventMessage.getTemplateId()).getTitle());
        wjCrmMessage.setBusinessId(eventMessage.getBusinessId());
        wjCrmMessage.setBusinessType(MessageTemplate.getEnumByCode(eventMessage.getTemplateId()).getBusinessPageType());
        log.info(wjCrmMessage.toString());
       /* wjCrmMessageMapper.insert(wjCrmMessage);
        return wjCrmMessageMapper.noticeMessageDepart(eventMessage.getUserids(), wjCrmMessage.getMessageId());*/
        return 1;
    }

    /**
     * 遍历Map中的所有Key，将得到的value值替换模板字符串中的变量值
     *
     * @param map
     * @param templateId
     * @return
     */
    public String getMailText(Map<String, String> map, int templateId) {
        String htmlTemplate = MessageTemplate.getEnumByCode(templateId).getMessage();
        String htmlText = htmlTemplate;
        //遍历Map中的所有Key，将得到的value值替换模板字符串中的变量值
        Set<String> keys = map.keySet();
        for (Iterator<String> it = keys.iterator(); it.hasNext(); ) {
            String key = it.next();
            htmlText = htmlText.replace("{#" + key + "}", map.get(key));
        }
        return htmlText;
    }

}
