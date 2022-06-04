package com.pudge.test01;

import java.sql.Date;

public class DateTest2 {
    public static void main(String[] args) {
        Date date = new Date(1654318855778L);
        System.out.println(date);
        /*
         * java.sql.Date 和 java.util.Date
         * sql 有年月日，sql 是 util 的子类
         * */
        java.util.Date date1 = date;
        System.out.println(date1.getTime());
    }
}
