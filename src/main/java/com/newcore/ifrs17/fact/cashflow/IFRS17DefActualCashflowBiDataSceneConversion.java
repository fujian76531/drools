package com.newcore.ifrs17.fact.cashflow;

import lombok.Data;

/**
 * 直保实际现金流-双边数据场景转换规则
 * Created by XiaoTao on 8/3/2020 10:17 AM
 */
@Data
public class IFRS17DefActualCashflowBiDataSceneConversion {
    /**
     * 业务系统代码DATASOURCE
     */
    private String dataSource;

    /**
     * 收付费项目TRANSCODE
     */
    private String transCode;

    /**
     * 业务类别TRANSTYPE
     */
    private String transType;

    /**
     * 收付款方式PAYTYPE
     */
    private String payType;

    /**
     * 长短险标志RISKTYPE
     */
    private String riskType;

    /**
     * 冲应收标识TYPE_CYS
     */
    private String typeCys;

    /**
     * 到账确认标识ACCFLAG
     */
    private String accFlag;

    /**
     *
     */
    private String accType1;

    /**
     * 是否有效
     */
    private String isValid;
    /**
     * 一级分类
     */
    private String priClassification;
    /**
     *二级分类
     */
    private String secClassification;
    /**
     * 场景名称
     */
    private String sceneName;
    /**
     * 场景编号
     */
    private String sceneNum;

    private String remark;
}
