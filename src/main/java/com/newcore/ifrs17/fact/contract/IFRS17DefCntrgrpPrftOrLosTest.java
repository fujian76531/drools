package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * Created by XiaoTao on 6/1/2020 2:21 PM
 * 盈亏测试
 */
@Data
public class IFRS17DefCntrgrpPrftOrLosTest {
    /**
     *最小核算单元编码
     */
    private String minAccUnitCode;
    /**
     * 最小核算单元名称
     */
    private String minAccUnitName;
    /**
     * 被保险人投保年龄
     */
    private String insuredAge;
    /**
     * 被保险人性别
     */
    private String insuredSex;
    /**
     * 投保险人投保年龄
     */
    private String holderAge;
    /**
     * 投保险人性别
     */
    private String holderSex;
    /**
     * 缴费期间类型
     */
    private String moneyinDurUnit;
    /**
     * 缴费期间
     */
    private String moneyinDurAmnt;
    /**
     * 保险期间类型
     */
    private String insurDurUnit;
    /**
     * 保险期间
     */
    private String insurDurAmnt;
    /**
     * 判断类型
     */
    private String type;
    /**
     * 年化保费上限
     */
    private String annualizedPremiumCeiling;
    /**
     * 年化保费下限
     */
    private String annualizedPremiumFloor;
    /**
     * 保额上限
     */
    private String faceAmntCeiling;
    /**
     * 保额下限
     */
    private String faceAmntFloor;


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
     * 盈亏测试结果
     */
    private String profitOrLossTestResult;
    private String giftType;
    private String bonusProp;
    /**
     * 配置信息生效日期
     */
    private String efftdate;
    /**
     * 规则描述
     */
    private String remark;
}
