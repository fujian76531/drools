package com.newcore.ifrs17.fact.contract;

import lombok.Data;

import java.util.Date;

/**
 * Created by XiaoTao on 6/1/2020 10:15 AM
 * 最小计量单元
 */
@Data
public class IFRS17DefCntrgrpMinCalUnit {
    /**
     * 精算代码
     */
    private String polCode;
    /**
     * 产品名称
     */
    private String polName;
    /**
     * 是否合并
     */
    private String isMerge;
    /**
     * 被合并产品精算代码
     */
    private String polCodeMerged;
    /**
     * 被合并产品名称
     */
    private String prodNameMerged;
    /**
     * 最小计量单元编码
     */
    private String minCalUnitCode;
    /**
     * 最小计量单元名称
     */
    private String minCalUnitName;

    /**
     * 执行顺序
     */
    private String excOrder;

    /**
     * 配置信息生效日期
     */
    private Date efftdate;
    /**
     * 规则描述
     */
    private String remark;
}
