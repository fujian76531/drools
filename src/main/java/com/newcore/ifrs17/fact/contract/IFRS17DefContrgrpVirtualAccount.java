package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2020/12/28
 * @description：合同分组团帽单配置表
 */
@Data
public class IFRS17DefContrgrpVirtualAccount {
    /**
     * 精算代码
     */
    private String polCode;

    /**
     * 产品名称
     */
    private String polName;

    /**
     * 是否需要团帽单
     */
    private String isNeedGroupcap;

    private String remark;

}
