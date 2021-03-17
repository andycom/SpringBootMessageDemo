package com.fancv.entity.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * CRM 消息列表VO 对象
 *
 * @author hamish-wu
 */
@ApiModel("消息列表对象")
public class CrmMessageListVO implements Serializable {

    @ApiModelProperty("消息id")
    private Long messageId;
    /**
     * 公告标题
     */
    @ApiModelProperty("消息Title")
    private String title;

    /**
     * 消息内容
     */
    @ApiModelProperty("消息内容")
    private String messageContent;

    /**
     * 业务id
     */
    @ApiModelProperty("相关业务id")
    private Integer businessId;

    /**
     * 业务类型  线索详情1 客户详情 2  客户列表 3   审批 4
     */
    @ApiModelProperty("相关业务类型")
    private Integer businessType;


    /**
     * 超链接名称
     */
    @ApiModelProperty("超链接业务名称")
    private String name;


    /**
     * 发布时间
     */
    @ApiModelProperty("消息时间")
    private LocalDateTime publishTime;

    /**
     * 发布时间
     */
    @ApiModelProperty("消息时间戳")
    private Long publishTimeTimeStamp;
}
