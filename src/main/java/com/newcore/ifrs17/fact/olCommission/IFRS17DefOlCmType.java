package com.newcore.ifrs17.fact.olCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金费用类型配置表
 */
@Data
public class IFRS17DefOlCmType {

    /**
     * 佣金类型
     */
    private String commisionType;

    /**
     * 评估方法
     */
    private String zzassess;

    /**
     * 费用类型
     */
    private String feeType;

    /**
     * 费用类型说明
     */
    private String feeTypeInstruct;

    /**
     * 备注
     */
    private String remark;
}
