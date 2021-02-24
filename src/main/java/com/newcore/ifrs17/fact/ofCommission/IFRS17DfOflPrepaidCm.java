package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：待摊费用业务类型配置表
 */
@Data
public class IFRS17DfOflPrepaidCm {
    /**
     * 科目代码
     */
    private String subjectsId;

    /**
     * 科目名称
     */
    private String subjectsName;

    /**
     * 凭证类型
     */
    private String credentialsType;

    /**
     *备注
     */
    private String remark;
}
