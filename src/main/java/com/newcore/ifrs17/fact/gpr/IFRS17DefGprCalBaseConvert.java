package com.newcore.ifrs17.fact.gpr;

import lombok.Data;

/**
 * GPR-定价准备金计算基础转换表
 * Created by XiaoTao on 7/8/2020 9:58 AM
 */
@Data
public class IFRS17DefGprCalBaseConvert {
    /**
     * 精算代码
     */
    private String polCode;

    /**
     * 产品名称
     */
    private String polName;

    /**
     * 定价准备金计算基础转换后的值
     */
    private int calBaseConverted;

    /**
     * 备注
     */
    private String remark;

}
