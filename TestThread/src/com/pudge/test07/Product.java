package com.pudge.test07;

public class Product {
    private String brand;
    private String name;

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

    public synchronized void produce(String brand, String name) {
        if (flag) {
            try {
                wait();
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
        notify();
    }

    public synchronized void consume() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumes: " + this.getBrand() + "---" + this.getName());
        flag = false;
        notify();
    }
}
