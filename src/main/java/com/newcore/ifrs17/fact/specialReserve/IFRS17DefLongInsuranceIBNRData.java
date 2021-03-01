package com.newcore.ifrs17.fact.specialReserve;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/1
 * @description：长险IBNR数据表
 */
@Data
public class IFRS17DefLongInsuranceIBNRData {

    /**
     * 颗粒度
     */
    private String granularity;

    /**
     * 理赔责任分类
     */
    private String liClassification;

    /**
     * IBNR金额
     */
    private String IBNRFee;

    /**
     * 评估日期
     */
    private String accessDate;

    /**
     * 备注
     */
    private String remark;
}
