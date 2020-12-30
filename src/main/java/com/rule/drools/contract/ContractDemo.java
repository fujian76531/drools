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
        KieSession ks = kc.newKieSession("IFRS17DefCntrgrpUnmodelModeledMapping");

        IFRS17DefCntrgrpUnmodelModeledMapping demo = new IFRS17DefCntrgrpUnmodelModeledMapping();

        demo.setPolCode(" ");
        demo.setPolName(" ");
        demo.setTargetPolCode(" ");

        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
