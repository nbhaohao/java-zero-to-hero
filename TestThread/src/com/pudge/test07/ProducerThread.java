package com.pudge.test07;

public class ProducerThread implements Runnable {
    private final Product product;

    public ProducerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                product.produce("apple", "iPhone");
            } else {
                product.produce("HuaWei", "Honor");
            }
        }
    }
}
