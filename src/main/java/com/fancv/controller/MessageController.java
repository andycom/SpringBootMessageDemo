package com.fancv.controller;

import com.fancv.entity.BO.NoticeMessageBO;
import com.fancv.service.MessageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hamish-wu
 */
@RestController
@RequestMapping("message")
public class MessageController {

    @Resource
    MessageService messageService;

    @PostMapping("/message-notice")
    @ApiOperation("4.0 CRM 页面群发消息")
    public Integer addMessageNotice(@RequestBody NoticeMessageBO noticeMessageBO) {
        return messageService.addMessageNotice(noticeMessageBO);
    }

}
