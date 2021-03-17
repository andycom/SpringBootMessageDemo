package com.fancv.service;

import com.fancv.entity.BO.NoticeMessageBO;
import com.fancv.entity.VO.CrmMessageUnRead;

import java.util.List;

public interface MessageService {

    Boolean batchRemove(List<Long> ids);

    Boolean readedBatchRemove();

    Boolean batchRead(List<Long> ids);

    Boolean allbatchRead();

    CrmMessageUnRead unReadNumber(long userId);


    int addMessageNotice(NoticeMessageBO noticeMessageBO);
}
