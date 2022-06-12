package com.pudge.test07;

public class ConsumerThread implements Runnable {
    private final Product product;

    public ConsumerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            product.consume();
        }
    }
}
