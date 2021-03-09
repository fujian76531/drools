package com.rule.drools.gpr;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.*;

/**
 * Created by XiaoTao on 7/8/2020 4:18 PM
 */
public class GprDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("min_acc_unit_code");
        list.add("min_acc_unit_name");
        list.add("is_applicability");
        list.add("efftdate");
        list.add("expdate");
        if(list.size()>0){
            String sqler = "";

            for (String s : list) {
                System.out.println(s);
            }
            StringBuffer sb = new StringBuffer();
            list.forEach(str-> sb.append(str).append(" varchar,"));
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
            String tableName = "dw_dm.def_re_cntrgrp_i17";
            String[] split = tableName.split("\\.");
            System.out.println(split.toString());

            sqler = "CREATE TABLE " + tableName + " (" + sb.toString() + ");";

            System.out.println(sqler);
        }

        String errorCode = "L1021;L1031";
        String errorCode1 = "L1021";
        String errorCode2 = "L1031";
        List<String> errorCodeList = new ArrayList<>();
        errorCodeList.add(errorCode1);
        errorCodeList.add(errorCode2);
        String[] errorCodeArray = errorCode.split(";");
        if(errorCodeArray.length > 0){

            List<String> strings = Arrays.asList(errorCodeArray);
            for (String string : strings) {
                for (String s : errorCodeList) {
                    if (string.equalsIgnoreCase(s)){
                        strings.remove(string);
                        break;
                    }
                }
            }

            if (strings.size() == 0 ){
                System.out.println("啊哈哈哈哈");
            }
        }

        System.out.println(errorCodeArray.toString());


        Map map = new HashMap<>();

        map.put(1, "a");

        map.put(2, "b");

        map.put(3, "c");

        map.replace("d","c");
        System.out.println("aaa");


    }
}
