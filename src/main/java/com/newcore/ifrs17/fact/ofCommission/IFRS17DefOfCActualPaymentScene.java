package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金实付IFRS4记账场景配置表
 */
@Data
public class IFRS17DefOfCActualPaymentScene {
    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 佣金类型
     */
    private String commissionType;

    /**
     * 佣金实付批次
     */
    private String commissionBatch;
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
