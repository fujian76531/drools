package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：手续费实付制证场景映射表
 */
@Data
public class IFRS17DefOLPaymentSystem {

    /**
     * 费用类型
     */
    private String expenseType;

    /**
     * 对应科目
     */
    private String orrespondingAccount;

    /**
     * 对用科目名称
     */
    private String accountName;

    /**
     * 场景编号
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
