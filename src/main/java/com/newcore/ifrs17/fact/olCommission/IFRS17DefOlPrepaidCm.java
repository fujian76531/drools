package com.newcore.ifrs17.fact.olCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：待摊佣金数据佣金类型配置表
 */
@Data
public class IFRS17DefOlPrepaidCm {

    /**
     * 佣金类型
     */
    private String commisionType;

    /**
     * 备注
     */
    private String remark;
}
