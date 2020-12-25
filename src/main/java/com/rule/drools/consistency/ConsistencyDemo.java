package com.rule.drools.consistency;

import com.newcore.ifrs17.fact.consistency.DwdI17InsurancePolicyDayOfl;
import com.newcore.ifrs17.fact.consistency.DwdI17PrdInsurTypeDayOfl;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by XiaoTao on 7/8/2020 4:18 PM
 */
public class ConsistencyDemo {
    public static void main(String[] args) throws InterruptedException {
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("DwdI17InsurancePolicyDayOfl");

        DwdI17InsurancePolicyDayOfl demo = new DwdI17InsurancePolicyDayOfl();
        demo.setCntrStat("L");
        //demo.setFaceAmnt(-1d);
        Date date = new Date(2021,0,01);
        Thread.sleep(1000);
        demo.setInsEndDate(new Date());
        //demo.setInsEfftDate(date);
        ks.insert(demo);
        int count = ks.fireAllRules();
        //int i = demo.getInsEndDate().compareTo(date);
//        System.out.println(i);
        System.out.println("总执行了"+count+":"+demo.getRemark());
        System.out.println(checkDate2((Object) new Date(),date,0));
        ks.dispose();
    }

    public static boolean checkDate2(Object beforeDate ,Object afterDate,int value){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date) afterDate);
        calendar.add(Calendar.DAY_OF_MONTH,value);
        Date dt1=calendar.getTime();
        calendar.setTime((Date) beforeDate);
        Date dt2=calendar.getTime();
        if(dt2.compareTo(dt1)<0){
            return true;
        }else{
            return false;
        }
    }
}
