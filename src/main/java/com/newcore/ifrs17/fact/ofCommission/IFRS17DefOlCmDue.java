package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金承诺项配置表
 */
@Data
public class IFRS17DefOlCmDue {

    /**
     * 业务类型代码
     */
    private String businessCode;

    /**
     * 业务类型说明
     */
    private String businessCodeInsruct;

    /**
     * 承诺项目
     */
    private String fipos;

    /**
     * 备注
     */
    private String remark;
}
