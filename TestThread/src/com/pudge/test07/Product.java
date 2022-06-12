package com.pudge.test07;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Product {
    private String brand;
    private String name;

    Lock lock = new ReentrantLock();
    Condition produceCondition = lock.newCondition();
    Condition consumeCondition = lock.newCondition();

    boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void produce(String brand, String name) {
        lock.lock();
        try {
            if (flag) {
                try {
//                    wait();
                    produceCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("Producer produces: " + this.getBrand() + "---" + this.getName());
            flag = true;
            consumeCondition.signal();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void consume() {
        lock.lock();
        try {
            if (!flag) {
                try {
                    consumeCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Consumer consumes: " + this.getBrand() + "---" + this.getName());
            flag = false;
            produceCondition.signal();
        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {
            lock.unlock();
        }

    }
}
