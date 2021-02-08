package com.newcore.ifrs17.fact.olCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：代扣附加佣金项目配置表
 */
@Data
public class IFRS17DefOlAdditionalCm {

    /**
     * 源业务系统编号
     */
    private String systemId;

    /**
     * 业务类型代码
     */
    private String businessCode;

    /**
     * 业务类型说明
     */
    private String businessCodeInsruct;

    /**
     * 备注
     */
    private String remark;
}
