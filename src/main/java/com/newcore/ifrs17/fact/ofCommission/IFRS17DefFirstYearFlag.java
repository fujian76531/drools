package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：首续年标识、评估方法与费用类型映射表
 */
@Data
public class IFRS17DefFirstYearFlag {

    /**
     * 评估方法
     */
    private String assesmentMethod;

    /**
     * 首续年标识
     */
    private String firstYearFlag;

    /**
     * 费用类型
     */
    private String feeType;

    /**
     * 备注
     */
    private String remark;
}
