package com.newcore.ifrs17.fact.cashflow;

import lombok.Data;

@Data
public class IFRS17DefActualCashflowUniNCreditC8 {
    /**
     * 业务系统代码
     */
    private String dataSource;

    /**
     * 收付费项目
     */
    private String transCode;

    /**
     * 业务类别
     */
    private String transType;

    /**
     * 收付款方式
     */
    private String payType;

    /**
     * 长短险标志
     */
    private String riskType;

    /**
     * 冲应收标识TYPE_CYS
     */
    private String typeCys;

    /**
     * 到账确认标识
     */
    private String accFlag;

    /**
     *
     */
    private String accType1;

    /**
     * 数据取舍
     */
    private String isKeep;

    private String remark;
}
