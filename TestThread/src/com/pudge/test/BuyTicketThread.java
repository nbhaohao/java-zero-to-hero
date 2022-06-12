package com.pudge.test;

public class BuyTicketThread extends Thread {
    static int ticketNum = 1000;

    public BuyTicketThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (BuyTicketThread.class) {
                if (ticketNum > 0) {
                    System.out.println(this.getName() + "我买到了从北京到哈尔滨的第" + ticketNum + "张车票");
                    ticketNum--;
                }
            }
        }
    }
}
