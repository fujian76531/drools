package com.rule.drools.contract;

import com.newcore.ifrs17.fact.ofCommission.IFRS17DefOfCAutoVerComData;
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
        KieSession ks = kc.newKieSession("IFRS17DefOfCAutoVerComData");

        IFRS17DefOfCAutoVerComData demo = new IFRS17DefOfCAutoVerComData();

        //demo.setReRiskTextResult("acCA");
//        demo.setReProfitOrLossTestResultUptime("2022-11-11");

        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
