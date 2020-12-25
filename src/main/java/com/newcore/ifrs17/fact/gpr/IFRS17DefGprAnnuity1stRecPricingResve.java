package com.newcore.ifrs17.fact.gpr;

import lombok.Data;

/**
 * GPR-需计算年金首次领取日定价准备金的产品列表
 * Created by XiaoTao on 7/8/2020 2:49 PM
 */
@Data
public class IFRS17DefGprAnnuity1stRecPricingResve {

    /**
     * 精算代码
     */
    private String polCode;

    /**
     * 产品名称
     */
    private String polName;


    /**
     * 产品是否需要计算年金首次领取日定价准备金（N/Y）
     */
    private String isAnnuity1stRecPricingResve;

    /**
     * 备注
     */
    private String remark;

}
