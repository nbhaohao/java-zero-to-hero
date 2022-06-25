package com.pudge;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        TemporalAdjuster temporalAdjuster = (temporal -> {
            LocalDateTime localDateTime = (LocalDateTime) temporal;
            return localDateTime.plusMonths(1).withDayOfMonth(1);
        });
        System.out.println(now.with(temporalAdjuster));
        System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
    }
}
