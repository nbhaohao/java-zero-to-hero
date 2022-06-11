package com.pudge.test02;

public class Test {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        new Thread(testThread, "child thread1").start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }
    }
}
