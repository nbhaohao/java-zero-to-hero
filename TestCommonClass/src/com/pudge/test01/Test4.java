package com.pudge.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test4 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_WEEK));
    }
}
