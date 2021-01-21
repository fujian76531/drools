package com.newcore.ifrs17.fact.Political;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/19
 * @description：实际管理费
 */

@Data
public class IFRS17DefPltcDvdActualMngFee {

    /**
     * 团单号
     */
    private String groupNo;

    /**
     * 年份
     */
    private String calYear;

    /**
     * 实际管理费金额
     */
    private BigDecimal actualMngFee;

    /**
     * 备注
     */
    private String remark;
}
