package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：线下佣金手续费合同组保单制证场景映射表
 */
@Data
public class IFRS17DefOLFeeContract {

    /**
     * 费用类型
     */
    private String expenseType;

    /**
     * 科目代码
     */
    private String accountCode;

    /**
     * 场景编号
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
