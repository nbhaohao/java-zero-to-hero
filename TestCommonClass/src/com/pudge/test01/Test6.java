package com.pudge.test01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test6 {
    public static void main(String[] args) {
        // 获取当前日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate1 = LocalDate.of(2010, 5, 6);
        System.out.println(localDate1);
        LocalTime localTime1 = LocalTime.of(12, 35, 56);
        System.out.println(localTime1);
        LocalDateTime localDateTime1 = LocalDateTime.of(1890, 12, 23, 13, 24, 15);
        System.out.println(localDateTime1);
        System.out.println("-----");
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
    }
}
