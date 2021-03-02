package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：线下佣金手续费分类结果核算场景映射表
 */
@Data
public class IFRS17DefOLClassificationFee {

    /**
     * 费用类型
     */
    private String expenseType;

    /**
     * 科目代码
     */
    private String accountCode;

    /**
     * 场景编码
     */
    private String accType1;

    /**
     * 场景描述
     */
    private String sceneDescription;

    /**
     * 备注
     */
    private String remark;
}
