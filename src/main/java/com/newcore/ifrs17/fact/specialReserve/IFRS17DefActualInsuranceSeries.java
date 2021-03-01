package com.newcore.ifrs17.fact.specialReserve;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/1
 * @description：当期实际利源险种级数据表
 */
@Data
public class IFRS17DefActualInsuranceSeries {

    /**
     * 精算代码
     */
    private String polCode;

    /**
     * 颗粒度
     */
    private String granularity;

    /**
     * 数据项目
     */
    private String dataProject;

    /**
     * 数据项目值
     */
    private String itemValue;

    /**
     * 评估日期
     */
    private String accessDate;

    /**
     * 备注
     */
    private String remark;
}
