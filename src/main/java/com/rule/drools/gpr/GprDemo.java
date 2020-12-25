package com.rule.drools.gpr;

import com.newcore.ifrs17.fact.gpr.IFRS17DefGprAnnuity1stRecPricingResve;
import com.newcore.ifrs17.fact.gpr.IFRS17DefGprCalBaseConvert;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by XiaoTao on 7/8/2020 4:18 PM
 */
public class GprDemo {
    public static void main(String[] args){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("IFRS17DefGprAnnuity1stRecPricingResve");

        IFRS17DefGprAnnuity1stRecPricingResve demo = new IFRS17DefGprAnnuity1stRecPricingResve();
        demo.setPolName("A");
        demo.setIsAnnuity1stRecPricingResve("Y");
        demo.setPolCode("NULL");


        IFRS17DefGprCalBaseConvert demo1 = new IFRS17DefGprCalBaseConvert();
        demo1.setCalBaseConverted(9);
        demo1.setPolCode("NULL");
        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
