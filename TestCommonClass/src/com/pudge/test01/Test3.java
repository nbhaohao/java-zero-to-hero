package com.pudge.test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        java.sql.Date date = java.sql.Date.valueOf("2015-9-24");
        java.util.Date date1 = date;
        System.out.println(date1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(dateFormat.parse("2019-4-6 12:23:45"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dateFormat.format(new Date()));
    }
}
