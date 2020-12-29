package com.newcore.ifrs17.fact.contract;

import lombok.Data;

/**
 * Created by XiaoTao on 6/1/2020 1:24 PM
 */
@Data
public class IFRS17DefCntrgrpInsurNinsurSep {
    private String minCalUnitCode;
    private String minCalUnitName;
    private String insurComponent;
    private String investComponent;
    private String embeddedDerivatives;
    private String noninsurServiceComponent;
    private String remark;
}
