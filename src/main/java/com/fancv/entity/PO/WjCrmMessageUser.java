package com.fancv.entity.PO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WjCrmMessageUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否已读标识  0 未读 1 已读
     */
    @ApiModelProperty("是否已读标识  0 未读 1 已读")
    private String state;

    /**
     * 消息主键
     */
    @ApiModelProperty("消息主键")
    private Long messageId;

    /**
     * 接收用户id
     */
    @ApiModelProperty("接收用户id")
    private Integer recipientUserId;

    /**
     * 拉取时间
     */
    @ApiModelProperty("消息时间")
    private LocalDateTime pullTime;

    /**
     * 删除标识  1 删除
     */
    @ApiModelProperty("逻辑删除标识")
    private String delFlag;


}
