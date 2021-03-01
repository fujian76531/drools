package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * 万能险种-万能账户配置表
 * Created by XiaoTao on 6/17/2020 10:53 AM
 */
@Data
public class IFRS17DefContrgprAccountConfigrt {

    /**
     * 险种代码
     */
    private String polCode;

    /**
     * 是否为招行专户
     */
    private String isSpecialCmbAccount;

    /**
     * 账户编号
     */
    private String universalAccountNum;


    private String remark;
}
