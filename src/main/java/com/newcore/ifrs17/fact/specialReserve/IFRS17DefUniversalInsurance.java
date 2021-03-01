package com.newcore.ifrs17.fact.specialReserve;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/1
 * @description：万能险股东权益占比配置表
 */
@Data
public class IFRS17DefUniversalInsurance {

    /**
     * 合同组编码
     */
    private String contractGroupCode;

    /**
     * 股东权益占比
     */
    private String equityProp;

    /**
     * 生效日期
     */
    private String effectiveDate;

    /**
     * 备注
     */
    private String remark;
}
