package com.newcore.ifrs17.fact.specialReserve;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/1
 * @description：分红年金实际利源分摊险种代码配置表
 */
@Data
public class IFRS17DefDividendAnnuity {

    /**
     * 精算代码
     */
    private String polCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;
}
