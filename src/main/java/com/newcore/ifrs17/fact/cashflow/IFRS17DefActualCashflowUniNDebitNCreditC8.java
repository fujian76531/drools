package com.newcore.ifrs17.fact.cashflow;

import lombok.Data;

/**
 * I17多借多贷单边数据场景转换配置表（八版）
 * Created by XiaoTao on 9/1/2020 10:27 AM
 */
@Data
public class IFRS17DefActualCashflowUniNDebitNCreditC8 {
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
     * 冲应收标识
     */
    private String flagCys;

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
