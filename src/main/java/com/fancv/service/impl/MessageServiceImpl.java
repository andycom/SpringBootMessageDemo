package com.fancv.service.impl;

import com.fancv.entity.BO.NoticeMessageBO;
import com.fancv.entity.VO.CrmMessageUnRead;
import com.fancv.message.EventHandler;
import com.fancv.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hamish-wu
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    EventHandler eventHandler;


   /* @Resource
    WjCrmMessageMapper wjCrmMessageMapper;*/

    @Override
    public Boolean batchRemove(List<Long> ids) {
        return null;
    }

    @Override
    public Boolean readedBatchRemove() {
        return null;
    }

    @Override
    public Boolean batchRead(List<Long> ids) {
        return null;
    }

    @Override
    public Boolean allbatchRead() {
        return null;
    }

    @Override
    public CrmMessageUnRead unReadNumber(long userId) {
        return null;
    }


    @Override
    public int addMessageNotice(NoticeMessageBO noticeMessageBO) {
        eventHandler.eventPost(noticeMessageBO.getTemplateType(), noticeMessageBO.getMessage());
        return 1;
    }
}
