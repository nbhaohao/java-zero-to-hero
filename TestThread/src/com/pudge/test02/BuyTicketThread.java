package com.pudge.test02;

public class BuyTicketThread implements Runnable {
    int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this) {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "我买到了从北京到哈尔滨的第" + ticketNum + "张车票");
                    ticketNum--;
                }
            }

        }
    }
}
