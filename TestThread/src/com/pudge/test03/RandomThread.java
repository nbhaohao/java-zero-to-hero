package com.pudge.test03;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomThread implements Callable<Integer> {
    @Override
    public Integer call() {
        return new Random().nextInt(10);
    }
}
