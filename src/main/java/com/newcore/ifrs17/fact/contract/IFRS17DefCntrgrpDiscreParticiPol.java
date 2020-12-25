package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * Created by XiaoTao on 6/1/2020 1:46 PM
 */
@Data
public class IFRS17DefCntrgrpDiscreParticiPol {
    /**
     * 精算代码
     */
    private String polCode;
    /**
     * 产品名称
     */
    private String polName;
    /**
     * 具有相机参与分红特征产品
     */
    private String discreParticipationPol;
    /**
     * 规则描述
     */
    private String remark;
}
