package com.fancv.entity.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hamish-wu
 */
@Data
public class CrmMessageUnRead implements Serializable {

    private static final long serialVersionUID = 4572417681271554389L;
    /**
     * 总未读数
     */
    @ApiModelProperty("总未读数")
    Integer totalUnread;

    /**
     * 客户相关消息数
     * business_type  2、3、5
     */
    @ApiModelProperty("客户相关消息数 business_type  2、3、5")
    Integer customerMessageUnread;
    /**
     * 线索消息未读数
     * business_type 1
     */
    @ApiModelProperty("线索消息未读数 business_type 1")
    Integer leadMessageUnread;

    /**
     * 审批相关未读消息数
     * business_type 4
     */
    @ApiModelProperty("审批相关未读消息数 business_type 4")
    Integer approveMessageUnread;

}
