package com.rule.drools.contract;

import com.newcore.ifrs17.fact.consistency.DwdI17InsurancePolicyDayOfl;
import com.newcore.ifrs17.fact.olCommission.IFRS17DefOlCmPaidIfrs4;
import com.newcore.ifrs17.fact.reinsurance.IFRS17DefReCntrgrpI17;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by XiaoTao on 7/8/2020 4:18 PM
 */
public class ContractDemo {
    public static void main(String[] args){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("DwdI17InsurancePolicyDayOfl");

        DwdI17InsurancePolicyDayOfl demo = new DwdI17InsurancePolicyDayOfl();

//        demo.setInoutflag(1);
//        demo.setProfitOrLossTestResult("D");

        demo.setErrorCode("LL1021L1072012");
        demo.setCntrStat("L");
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse("1900-11-01 11:12:23");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        demo.setInsEndDate(date);
        ks.insert(demo);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count+":"+demo.getRemark());

        String s = dateToString(date, "yyyy-MM-dd");
        System.out.println(s);
        ks.dispose();
    }


    public static String dateToString(Object date, String format){
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateInfo = formatter.format((Date)date);
        return dateInfo;
    }
}
