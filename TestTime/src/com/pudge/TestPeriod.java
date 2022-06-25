package com.pudge;

import java.time.LocalDate;
import java.time.Period;

public class TestPeriod {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2022, 6, 26);
        Period between = Period.between(now, date);
        System.out.println(between.getDays());
    }
}
