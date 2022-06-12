package com.pudge.test06;

public class ProducerThread implements Runnable {
    private final Product product;

    public ProducerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (product) {
                if (i % 2 == 0) {
                    product.setBrand("apple");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product.setName("iPhone");
                } else {
                    product.setBrand("HuaWei");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    product.setName("Honor");
                }
                System.out.println("Producer produces: " + product.getBrand() + "---" + product.getName());
            }

        }
    }
}
