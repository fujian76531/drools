package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金业务类型所属类别配置表
 */
@Data
public class IFRS17DefOlCmBustype {

    /**
     * 源业务系统编号
     */
    private String systemId;

    /**
     * 业务类型代码
     */
    private String businessCode;

    /**
     * 业务类型说明
     */
    private String businessCodeInsruction;

    /**
     * 缴费期限
     */
    private String policyYear;

    /**
     * 缴费方式
     */
    private String moneyinMethod;

    /**
     * 佣金类型
     */
    private String commisionType;

    /**
     * 佣金类型说明
     */
    private String commisionTypeInsruction;

    /**
     * 备注
     */
    private String remark;
}
