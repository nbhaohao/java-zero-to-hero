package com.pudge.test05;

public class TestStop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 6) {
                Thread.currentThread().stop();
            }
            System.out.println(i);
        }
    }
}
