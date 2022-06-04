package com.pudge.test01;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        System.out.println(random.nextInt());

        Random random1 = new Random();
        // [0,10)
        System.out.println(random1.nextInt(10));
    }
}
