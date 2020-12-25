package com.newcore.ifrs17.fact.contract;

import lombok.Data;

import java.util.Date;

/**
 * Created by XiaoTao on 6/1/2020 2:04 PM
 */
@Data
public class IFRS17DefCntrgrpModelApply {
    private String minAccUnitCode;
    private String minAccUnitName;
    private int isApplicability;
    private Date efftdate;
    private String remark;
}
