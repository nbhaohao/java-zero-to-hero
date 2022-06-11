package com.pudge.test02;

public class TestBuyTicket {
    public static void main(String[] args) {
        BuyTicketThread buyTicketThread = new BuyTicketThread();
        new Thread(buyTicketThread, "窗口1").start();
        new Thread(buyTicketThread, "窗口2").start();
        new Thread(buyTicketThread, "窗口3").start();
    }
}
