package com.pudge;

import java.time.LocalTime;

public class TestTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime localTime = LocalTime.of(5, 3);
        System.out.println(now);
        System.out.println(localTime);
    }
}
