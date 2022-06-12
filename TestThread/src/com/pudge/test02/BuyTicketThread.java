package com.pudge.test02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuyTicketThread implements Runnable {
    int ticketNum = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            try {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "我买到了从北京到哈尔滨的第" + ticketNum + "张车票");
                    ticketNum--;
                }

            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
