package com.pudge.test03;

class TestThread extends Thread {

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "----" + i);
        }
    }
}

public class TestJoin {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 6) {
                TestThread testThread = new TestThread("xx");
                testThread.start();
                try {
                    testThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main-----" + i);
        }
//        TestThread testThread2 = new TestThread("yy");
    }
}
