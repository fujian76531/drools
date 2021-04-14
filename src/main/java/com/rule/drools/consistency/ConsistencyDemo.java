package com.rule.drools.consistency;

import com.newcore.ifrs17.fact.consistency.DwdI17InsurancePolicyDayOfl;
import com.newcore.ifrs17.fact.consistency.DwdI17PrdInsurTypeDayOfl;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = dateFormat1.parse("2009-06-01 00:00:00");

        Thread.sleep(1000);
        demo.setInsEndDate(new Date());

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        demo.setSignDate(format);
        Date date111 = dateFormat1.parse(format);
        long time = date111.getTime();
        long l = System.currentTimeMillis() - 24*60*60*1000;
        System.out.println(l>time);
//        demo.setStdPremium(-1.0);
        //demo.setInsEfftDate(date);
        ks.insert(demo);
        int count = ks.fireAllRules();
        //int i = demo.getInsEndDate().compareTo(date);
//        System.out.println(i);
        System.out.println("总执行了"+count+":"+demo.getRemark());
        System.out.println(checkDate2((Object) new Date(),date,0));

        ks.dispose();
        } catch (ParseException e) {

        }
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
