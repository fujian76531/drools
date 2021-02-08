package com.newcore.ifrs17.fact.olCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金结转核算场景配置表
 */
@Data
public class IFRS17DefOlCmSettleScene {

    /**
     * 佣金类型
     */
    private String commisionType;

    /**
     * 费用类型
     */
    private String feeType;

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
