package com.pudge;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TestZoneId {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now" + now);
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
    }
}
