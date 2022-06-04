package com.pudge.test01;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getTime());
        // instead of date.getTime()
        System.out.println(System.currentTimeMillis());
    }
}
