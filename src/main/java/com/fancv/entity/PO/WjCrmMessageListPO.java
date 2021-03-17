package com.fancv.entity.PO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author hamish-wu
 */
@Data
@ApiModel("分页列表PO")
public class WjCrmMessageListPO extends WjCrmMessage {

    @ApiModelProperty("消息id")
    private Long id;

    @ApiModelProperty("消息读取状态 0 未读 1 已读")
    private Boolean state;

}
