package com.newcore.ifrs17.fact.cashflow;

import lombok.Data;

/**
 * 单边数据借贷方向配置表
 * Created by XiaoTao on 9/1/2020 10:12 AM
 */
@Data
public class IFRS17DefActualCashflowUniDebitOrCredit {
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

    /**
     * 到账确认标识
     */
    private String accFlag;

    /**
     *借贷方向
     */
    private String direction;



    private String remark;
}
