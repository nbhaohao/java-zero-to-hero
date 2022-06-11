package com.pudge.test05;

class TestThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("child thread----" + i);
        }
    }
}

public class TestDaemon {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main----" + i);
        }
    }
}
