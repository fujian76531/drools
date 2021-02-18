package com.rule.drools.gpr;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.List;

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
}
