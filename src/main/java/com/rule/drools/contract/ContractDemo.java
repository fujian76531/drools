package com.rule.drools.contract;

import com.newcore.ifrs17.fact.cashflow.*;
import com.newcore.ifrs17.fact.contract.*;
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
        KieSession ks = kc.newKieSession("IFRS17DefCntrgrpPrftOrLosTest");

        IFRS17DefCntrgrpPrftOrLosTest demo = new IFRS17DefCntrgrpPrftOrLosTest();

        demo.setType("2");
        demo.setMinAccUnitCode("2");
        demo.setAnnualizedPremiumCeiling("1");
        demo.setAnnualizedPremiumFloor("8");
        demo.setFaceAmntCeiling("1");
        demo.setFaceAmntFloor("8");

        demo.setInsurDurAmnt("1.1");
        demo.setMoneyinDurAmnt("1");
        demo.setInsurDurUnit("1");
        demo.setInsuredAge("2.1");
        demo.setMoneyinDurAmnt("1");

        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
