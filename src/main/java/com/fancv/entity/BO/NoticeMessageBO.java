package com.fancv.entity.BO;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author hamish-wu
 */
@Data
@ApiModel(value = "公告消息BO", description = "用户群发 消息 填入部门id")
public class NoticeMessageBO implements Serializable {

    private static final long serialVersionUID = -286948068921896121L;

    /**
     * 模板id
     */
    Integer templateType;
    /**
     * 消息组装内容
     */
    Map message;
}
