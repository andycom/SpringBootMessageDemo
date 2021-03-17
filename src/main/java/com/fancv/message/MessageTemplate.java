package com.fancv.message;


import java.util.Optional;

/**
 * CRM 消息模板
 * 组装消息
 * 优化成后台配置
 * <p>
 * {#staffName}: 员工名称
 * {#name}  ：business name 业务名称
 * {#day} : 配置天数
 * {#day0}： 配置天数 N天内无法领取
 * {#leads_level}: 线索等级
 * {#tag} 客户标签  customer_tag  00-明确有意向，10-可能有意向，20-不确定是否有意向(考虑中)，30-无意向但未拒绝，40-明确拒绝
 * <p>
 * 跳转数据：
 * businessPageType    跳转页面
 * 1 ：客户详情页
 * 2 ：null
 * 3 : null
 * 5 : 领导分配客户页面
 * 6 ：线索详情页
 *
 * @author hamish-wu
 */

public enum MessageTemplate {
    AllocateCustomer("分配客户", "【客户分配】", 1, "{#staffName}将客户“{#name}”分配给你,请及时跟进", 1, "客户详情页"),
    HighSeaCustomer45("45无效拜访客户流入公海", "【客户回收】", 2, "你的客户{#name}因为{#day}天内未签约已自动流入公海，{#day0}天内无法再次领取，请悉知", 2, ""),
    HighSeaCustomer90("90天未签约客户流入公海", "【客户回收】", 3, "你的客户{#name} 因为{#day}天内未无有效跟进已自动流入公海，{#day0}个自然日内不能再领取，请悉知", 3, ""),
    PreHighSeaCustomer("45无效拜访客户流入公海", "【客户即将回收】", 4, "你的客户{#name} {#day}天后流入公海，请抓紧跟进", 1, "客户详情页"),
    DismissedStaffCustomer("离职员工客户", "【员工离职】", 5, "你的下属{#staffName}已经离职，其负责的客户{#name} 流转到你名下，请及时分配", 5, "分配客户"),
    ClueHighSeaNew("新发布线索命中公海-总监", "【重要商机】", 6, "公海中“{#name}”被标记为{#leads_level}{#tag}}，暂无跟进人，请及时安排销售跟进", 7, "线索详情页"),
    CluePrivateSeaNew("新发布线索命中私海-辖区对应销售", "【重要商机】", 7, "你跟进的“{#name}”被标记为{#leads_level}{#tag}，请重点跟进。", 1, "线索详情页"),
    ClueNewDirector("新发布线索命中线索池-总监", "【重要商机】", 8, "线索池中“{#name}”被标记为{#leads_level}{#tag}，请及时安排销售跟进转化。", 6, "线索详情页"),
    ClueNewStaff("新发布线索命中线索池-销售", "【重要商机】", 9, "你领取的线索“{#name}”被标记为{#leads_level}{#tag}，请尽快跟进转化。", 6, "线索详情页"),
    ClueFirstDirector("新发布全新线索命中线索池-总监", "【重要商机】", 10, "线索池有新的{#leads_level}{#tag}线索“{#name}”，请及时安排销售跟进转化。", 6, "线索详情页"),

    ;

    MessageTemplate(String name, String title, int id, String message, int businessPageType, String businessPageName) {
        this.name = name;
        this.title = title;
        this.id = id;
        this.message = message;
        this.businessPageType = businessPageType;
        this.businessPageName = businessPageName;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public int getBusinessPageType() {
        return businessPageType;
    }

    public String getTitle() {
        return title;
    }

    /**
     * 模板名称
     */
    private String name;

    private String title;

    /**
     * 模板id
     */
    private int id;
    /**
     * 模板内容
     */
    private String message;


    private int businessPageType;

    private String businessPageName;

    public static MessageTemplate getEnumByCode(Integer id) {
        Optional<MessageTemplate> m1 = EnumUtil.getEnumObject(MessageTemplate.class, e -> e.id == id);
        return m1.isPresent() ? m1.get() : null;
    }

}
