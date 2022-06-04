package com.pudge.test01;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入你想要查看的日期，例如：2019-3-7");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(Date.valueOf(date));
        int dayOfMonthValue = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int allDayValue = calendar.getActualMaximum(Calendar.DATE);
        int displayDayValue = 1;
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int index = 1; allDayValue > 0; index++) {
            if (firstDayOfWeek > 1) {
                System.out.print(" ");
                firstDayOfWeek--;
            } else {
                System.out.print(displayDayValue);
                if (displayDayValue == dayOfMonthValue) {
                    System.out.print("*");
                }
                allDayValue--;
                displayDayValue += 1;
            }
            System.out.print(index % 7 == 0 ? "\n" : "\t");
        }
    }
}
