package com.newcore.ifrs17.fact.reinsurance;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：再保IFRS17配置表
 */
@Data
public class IFRS17DefReCntrgrpI17 {

    /**
     * 最小计量单位编码
     */
    private String minCalCode;

    /**
     * 再保合同编号
     */
    private String contcode;

    /**
     * 分入分出标识
     */
    private String inoutflag;

    /**
     * 是否为提前通知终止
     */
    private String isNoticeTermOrAdjustFee;

    /**
     * 重测结果
     */
    private String sigRiskTestResult;

    /**
     * 重测结果配置的系统时间
     */
    private String sigRiskTestResultExcTime;

    /**
     * 盈利性结果
     */
    private String profitOrLossTestResult;

    /**
     * 盈利性结果更新时间
     */
    private String profitOrLossTestResultEfftdate;

    /**
     * 盈利性结果配置的系统时间
     */
    private String profitOrLossTestResultExcTime;

    /**
     * 模型适用性结果
     */
    private String isApplicability;

    /**
     * 模型适用性结果配置的系统时间
     */
    private String isApplicabilityExcTime;

    /**
     * 覆盖风险
     */
    private String riskCover;

    /**
     * excTime
     */
    private String excTime;

    /**
     * 备注
     */
    private String remark;
}
