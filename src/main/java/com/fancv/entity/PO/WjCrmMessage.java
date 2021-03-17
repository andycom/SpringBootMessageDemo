package com.fancv.entity.PO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2021-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Message 对象", description = "消息表")
@ToString
public class WjCrmMessage implements Serializable {

    private static final long serialVersionUID = -4028414323294849793L;
    /**
     * 主键
     */
    private Long messageId;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String messageContent;

    /**
     * 业务id
     */
    private Integer businessId;

    /**
     * 业务类型  线索详情: 1 客户详情 :2  客户列表: 3   审批: 4 领导待分配列表：5
     */
    @ApiModelProperty("1：客户详情  2：null  3:null  5：分配客户   6：线索详情  7：公海列表")
    private Integer businessType;

    /**
     * 消息类型  公告notice  1  提醒 Remind 2  11: 系统升级  12  业务变更   13 活动
     */
    @ApiModelProperty("1：公告notice    2：提醒 Remind : 11: 系统升级  12  ：业务变更   13 ：活动")
    private Integer type;

    /**
     * 超链接名称
     */
    @ApiModelProperty("超链接名称")
    private String name;

    /**
     * 接收消息用户的id 如果 type是  remind 为用户id  否则为0
     */
    @ApiModelProperty("接收消息用户的id 如果 type是  remind 为用户id  否则为0")
    private Integer recipientUserId;

    /**
     * 发布时间
     */
    @ApiModelProperty("发布时间")
    private LocalDateTime publishTime;


}
