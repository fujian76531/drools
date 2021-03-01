package com.newcore.ifrs17.fact.specialReserve;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/3/1
 * @description： 账户数据表
 */
@Data
public class IFRS17DefAccountDataSheet {

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 账户标识
     */
    private String accountFlag;

    /**
     * 颗粒度
     */
    private String granularity;

    /**
     * 个团标识
     */
    private String groupFlag;

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
