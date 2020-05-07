package com.rule.drools;

import com.rule.drools.pojo.Person;
import com.rule.drools.pojo.School;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by XiaoTao on 5/7/2020 10:21 AM
 */
public class RulesHello {
    public static void main(String[] args){

        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("contains");
        Person person = new Person();
        person.setName("张三");
        person.setAge(30);
        person.setClassName("一班");
        School school = new School();
        school.setClassName("一班");
        ks.insert(person);
        ks.insert(school);
        int count = ks.fireAllRules();

        System.out.println("总执行了"+count);
        ks.dispose();
    }
}
