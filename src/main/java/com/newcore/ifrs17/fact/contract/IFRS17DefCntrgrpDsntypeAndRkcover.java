package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * Created by XiaoTao on 6/1/2020 3:41 PM
 */
@Data
public class IFRS17DefCntrgrpDsntypeAndRkcover {
    /**
     * 产品精算代码
     */
    private String polCode;
    /**
     * 产品名称
     */
    private String polName;
    /**
     * 设计类型编码
     */
    private String designCode;
    /**
     * 设计类型
     */
    private String designType;
    /**
     * 覆盖风险编码
     */
    private String riskCoverCode;
    /**
     * 覆盖风险
     */
    private String riskCover;
    /**
     * 规则备注
     */
    private String remark;
}
