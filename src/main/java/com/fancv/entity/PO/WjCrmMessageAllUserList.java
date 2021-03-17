package com.fancv.entity.PO;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

/**
 * @author hamish-wu
 */
@Data
@ApiModel("群发消息")
public class WjCrmMessageAllUserList {

    private String state;

    private Integer messageId;

    private Integer recipientUserId;

    private Date pullTime;


}
