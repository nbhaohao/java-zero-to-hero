package com.pudge;

import java.time.Instant;

public class TestInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now.getNano());
        System.out.println(now.getEpochSecond());
        System.out.println(now.toEpochMilli());
//        645545000
//        1656121472
//        1656121472645
    }
}
