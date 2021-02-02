package com.rule.drools.contract;

import com.newcore.ifrs17.fact.ofCommission.IFRS17DefOfCAutoVerComData;
import com.newcore.ifrs17.fact.ofCommission.IFRS17DefOlCmBustype;
import com.newcore.ifrs17.fact.reinsurance.IFRS17DefReinsuranceIFRS17;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by XiaoTao on 7/8/2020 4:18 PM
 */
public class ContractDemo {
    public static void main(String[] args){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("IFRS17DefOlCmBustype");

        IFRS17DefOlCmBustype demo = new IFRS17DefOlCmBustype();

        demo.setSystemId("1");
        demo.setBusinessCode("2");
        demo.setBusinessCodeInsruction("3");
        demo.setPolicyYear("4");
        demo.setMoneyinMethod("5");
        demo.setCommisionType(" 6");
        demo.setCommisionTypeInsruction("7");

        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
