package com.fancv.entity.BO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hamish-wu
 */
@ApiModel("消息分页BO")
@Data
public class MessageListBO {

    /**
     * 消息读取状态  已读  1 未读  0  所有 ：3
     */
    @ApiModelProperty("消息读取状态  已读:  1 未读:  0  所有 ：3")
    private Integer state;


    @ApiModelProperty("线索详情：1 客户详情 ：2  客户列表：3  审批：4 分配客户列表： 5")
    private List<Integer> businessTypeList;
}
