package com.newcore.ifrs17.fact.ofCommission;

import lombok.Data;

/**
 * @author ：launcher
 * @date ：Created in 2021/1/27
 * @description：佣金自动制证属性配置表
 */
@Data
public class IFRS17DefOlCmAutopost {

    /**
     * 源业务系统编号
     */
    private String systemId;

    /**
     * 公司代码
     */
    private String companyCode;

    /**
     * 自动制证标识
     */
    private String autopost;

    /**
     * 备注
     */
    private String remark;
}
