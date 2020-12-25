package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * 未建模产品对应之已建模产品
 * Created by XiaoTao on 9/1/2020 9:27 AM
 */
@Data
public class IFRS17DefCntrgrpUnmodelModeledMapping {
    private String polCode;

    private String polName;

    private String targetPolCode;

    private String remark;
}
