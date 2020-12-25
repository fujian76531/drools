package com.newcore.ifrs17.fact.consistency;

import lombok.Data;

import java.util.Date;

/**
 * Created by XiaoTao on 11/19/2020 12:54 PM
 */
@Data
public class DwdI17InsurancePolicyDayOfl {

    //保单状态
    private String cntrStat;

    //保单终止日期
    private Date insEndDate;

    //保单生效日期
    private Date insEfftDate;

    //被保人投保性别
    private String insuredSex;

    //保额
    private Double faceAmnt;

    //是否支持X缴
    private String isSupYearMoneyin;

    private String isSupHalfYearMoneyin;

    private String isSupQuarterMoneyin;

    private String isSupMonthlyMoneyin;

    private String isSupSingleMoneyin;

    private String isSup3YearsMoneyin;

    //缴费期间
    private Double moneyinDur;

    //每期交费标准
    private Double stdPremium;

    //期初万能险账户价值
    private  Double beginUValue;

    //平均余额
    private Double aveFundBalance1;
    private Double aveFundBalance2;

    //合同签署日
    private Date signDate;

    //期末投连账户价值
    private Double endLValue;

    //责任终止日期
    private Date liaEndDate;

    //出险日期
    private Date occurDate;

    //报案日期
    private Date caserptDate;

    //缴费频率
    private String moneyinItrvl;

    private String remark;

}
