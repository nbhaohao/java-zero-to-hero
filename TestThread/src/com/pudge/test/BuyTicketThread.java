package com.pudge.test;

public class BuyTicketThread extends Thread {
    static int ticketNum = 1000;

    public BuyTicketThread(String name) {
        super(name);
    }

    public static synchronized void buyTicket() {
        if (ticketNum > 0) {
            System.out.println(Thread.currentThread().getName() + "我买到了从北京到哈尔滨的第" + ticketNum + "张车票");
            ticketNum--;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            buyTicket();
        }
    }
}
