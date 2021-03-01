package com.newcore.ifrs17.fact.specialReserve;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/1
 * @description：RA与LAE准备金率配置表
 */
@Data
public class IFRS17DefRAAndLAEReserves {

    /**
     * 颗粒度
     */
    private String granularity;

    /**
     * 数字项目
     */
    private String numItem;

    /**
     * 数字项目值
     */
    private String numItemValue;

    /**
     * 生效日期
     */
    private String effectiveDate;

    /**
     * 备注
     */
    private String remark;
}
