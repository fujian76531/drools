package com.newcore.ifrs17.fact.contract;

import lombok.Data;

import java.util.Date;

/**
 * Created by XiaoTao on 6/1/2020 2:59 PM
 * 重大风险测试
 */
@Data
public class IFRS17DefCntrgrpSigRiskTest {
    /**
     * 最小计量单元编码
     */
    private String minAccUnitCode;
    /**
     * 最小计量单元名称
     */
    private String minAccUnitName;
    /**
     * 被保险人性别
     */
    private String insuredAge;
    /**
     * 被保险人投保年龄
     */
    private String insuredSex;
    /**
     * 缴费期间类型
     */
    private String moneyinDurUnit;
    /**
     * 保险期间
     */
    private String moneyinDurAmnt;
    /**
     * 保险期间类型
     */
    private String insurDurUnit;
    /**
     * 缴费期间
     */
    private String insurDurAmnt;
    /**
     * 年金领取类型
     */
    private String annuityRecType;

    /**
     *年金领取频率
     */
    private String annuityRecItrvl;

    /**
     * 年金领取年龄
     */
    private String annuityRecAge;
    /**
     * 重大风险测试结果
     */
    private int sigRiskTestResult;
    /**
     * 配置信息生效日期*/

    private Date efftdate;
    /**
     * 规则描述
     */
    private String remark;
}
