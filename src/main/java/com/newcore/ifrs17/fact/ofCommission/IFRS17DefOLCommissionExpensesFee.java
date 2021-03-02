package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：手续费及佣金支出科目与应付科目对应关系
 */
@Data
public class IFRS17DefOLCommissionExpensesFee {

    /**
     * 科目代码
     */
    private String accountCode;

    /**
     * 应付科目名称
     */
    private String accountName;

    /**
     * 对应科目
     */
    private String correspondingAccount;

    /**
     * 费用科目名称
     */
    private String expenseAccountName;

    /**
     * 备注
     */
    private String remark;
}
