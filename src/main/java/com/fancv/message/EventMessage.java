package com.fancv.message;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author hamish-wu
 */
@Data
@Builder
public class EventMessage implements Serializable {

    /**
     * 模板id
     */
    private int templateId;

    /**
     * 业务名称
     */
    private String name;
    /**
     * 业务id
     */
    private int businessId;

    /**
     * 接收用户的id
     */
    private List<Integer> userids;

    /**
     * 消息替换数据
     */
    private Map message;

}
