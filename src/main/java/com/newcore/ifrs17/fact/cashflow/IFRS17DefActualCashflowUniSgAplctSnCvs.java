package com.newcore.ifrs17.fact.cashflow;

import lombok.Data;

/**
 * 单一应用单边数据场景转换配置表
 * Created by XiaoTao on 9/1/2020 10:18 AM
 */
@Data
public class IFRS17DefActualCashflowUniSgAplctSnCvs  {

    private String dataSource;

    /**
     * 收付费项目
     */
    private String transCode;

    /**
     * 业务类别
     */
    private String transType;

    /**
     * 收付款方式
     */
    private String payType;

    private String flagCys;

    /**
     * 财务使用状态
     */
    private String usestatus;




    private String accType1;

    /**
     *场景说明
     */
    private String scene;

    private String remark;


}
