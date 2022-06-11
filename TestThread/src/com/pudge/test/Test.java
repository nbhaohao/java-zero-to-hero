package com.pudge.test;

class TestThread extends Thread {

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "-" + i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // set main's thread name
        Thread.currentThread().setName("main");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "1------" + i);
        }
        new TestThread("A").start();
        new TestThread("B").start();
        new TestThread("C").start();
    }
}
