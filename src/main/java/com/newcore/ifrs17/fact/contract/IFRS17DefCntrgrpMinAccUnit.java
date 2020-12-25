package com.newcore.ifrs17.fact.contract;

import lombok.Data;

import java.util.Date;

/**
 * Created by XiaoTao on 5/30/2020 2:00 PM
 * 最小核算单元
 */
@Data
public class IFRS17DefCntrgrpMinAccUnit {
    /**
     * 最小计量单元编码
     */
    private String minCalUnitCode;
    /**
     * 最小计量单元名称
     */
    private String minCalUnitName;
    /**
     * 重大保险风险测试结果
     */
    private String sigInsurRiskTestResult;
    /**
     * 相机分红特征投资合同
     */
    private String discreParticipationContract;
    /**
     * 保险-非保险成分的分拆
     */
    private String insurNinsurSep;
    /**
     * 最小核算单元编码
     */
    private String minAccUnitCode;
    /**
     * 最小核算单元名称
     */
    private String minAccUnitName;
    /**
     * 配置信息生效日期
     */
    private Date efftdate;
    /**
     * 规则备注
     */
    private String remark;
}
