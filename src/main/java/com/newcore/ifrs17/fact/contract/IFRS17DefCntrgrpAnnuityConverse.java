package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * 年金险种转换
 * Created by XiaoTao on 6/17/2020 10:53 AM
 */
@Data
public class IFRS17DefCntrgrpAnnuityConverse {
    private String polCode;


    private String polName;


    /**
     * 是否需要年金险种转换
     */
    private String isAnnuityConversion;


    /**
     * 转换后险种代码
     */
    private String polCodeConverted;

    /**
     * 年金领取方式
     */
    private String annunityRecMode;

    private String remark;
}
