package com.newcore.ifrs17.fact.contract;

import lombok.Data;

import java.util.Date;

/**
 * Created by XiaoTao on 6/1/2020 2:47 PM
 * 盈亏测试方式
 */
@Data
public class IFRS17DefCntrgrpPrftOrLosTestMthd {
    /**
     * 最小核算单元编码
     */
    private String minAccUnitCode;
    /**
     * 最小核算单元名称
     */
    private String minAccUnitName;
    /**
     * 精算代码
     */
    private String polCode;
    /**
     * 产品名称
     */
    private String polName;
    /**
     * 盈亏测试方式
     */
    private String profitOrLossTestMethod;
    /**
     * 配置信息生效日期
     */
    private Date efftdate;
    /**
     * 规则描述
     */
    private String remark;
}
