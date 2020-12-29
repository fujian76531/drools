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
        KieSession ks = kc.newKieSession("IFRS17DefCntrgrpMinCalUnit");

        IFRS17DefCntrgrpMinCalUnit demo = new IFRS17DefCntrgrpMinCalUnit();
        demo.setPolCode("ac");
        demo.setPolName("2w");
        demo.setIsMerge("Y");
        demo.setProdNameMerged("Y");
        demo.setPolCodeMerged("Y");

        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
