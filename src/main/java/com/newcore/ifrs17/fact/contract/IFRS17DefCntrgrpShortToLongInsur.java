package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * 短团险按长险计量
 * Created by XiaoTao on 8/3/2020 10:04 AM
 */
@Data
public class IFRS17DefCntrgrpShortToLongInsur {
    /**
     * 精算代码
     */
    private String polCode;

    /**
     * 产品名称
     */
    private String polName;

    /**
     * 是否按长险计量
     */
    private String isLongTermInsur;

    private String remark;
}
