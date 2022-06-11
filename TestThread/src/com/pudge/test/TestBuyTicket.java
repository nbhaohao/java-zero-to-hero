package com.pudge.test;

public class TestBuyTicket {
    public static void main(String[] args) {
        BuyTicketThread t1 = new BuyTicketThread("窗口1");
        t1.start();
        BuyTicketThread t2 = new BuyTicketThread("窗口2");
        t2.start();
        BuyTicketThread t3 = new BuyTicketThread("窗口3");
        t3.start();
    }
}
