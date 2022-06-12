package com.pudge.test06;

public class ConsumerThread implements Runnable {
    private final Product product;

    public ConsumerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (product) {
                System.out.println("Consumer consumes: " + product.getBrand() + "---" + product.getName());
            }
        }
    }
}
