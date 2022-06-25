package com.pudge;

import java.time.Duration;
import java.time.LocalTime;

public class TestDuration {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(10, 50, 0);
        Duration duration = Duration.between(time1, time2);
        System.out.println(duration.toHours());
    }
}
