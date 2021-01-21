package com.rule.drools.gpr;

import com.newcore.ifrs17.fact.Political.IFRS17DefPltcDvdActualMngFee;
import com.newcore.ifrs17.fact.gpr.IFRS17DefGprAnnuity1stRecPricingResve;
import com.newcore.ifrs17.fact.gpr.IFRS17DefGprCalBaseConvert;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigDecimal;

/**
 * Created by XiaoTao on 7/8/2020 4:18 PM
 */
public class GprDemo {
    public static void main(String[] args){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("IFRS17DefPltcDvdActualMngFee");

        IFRS17DefPltcDvdActualMngFee demo = new IFRS17DefPltcDvdActualMngFee();
        demo.setGroupNo("");
        demo.setCalYear("1234");
        demo.setActualMngFee(BigDecimal.valueOf(1));
        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());
        ks.dispose();
    }
}
