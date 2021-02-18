package com.newcore.ifrs17.fact.olCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金IFRS4应付核算场景配置表
 */
@Data
public class IFRS17DefOlCmIfrs4DueScene {

    /**
     * 业务类型代码
     */
    private String businessCode;

    /**
     * 业务类型说明
     */
    private String businessCodeInsruct;

    /**
     * 佣金类型
     */
    private String commisionType;

    /**
     * 场景编码
     */
    private String accType1;

    /**
     * 场景名称
     */
    private String sceneName;

    /**
     * 备注
     */
    private String remark;
}
