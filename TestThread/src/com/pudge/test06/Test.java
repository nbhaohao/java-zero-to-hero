package com.pudge.test06;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        ProducerThread producerThread = new ProducerThread(product);
        ConsumerThread consumerThread = new ConsumerThread(product);
        new Thread(producerThread).start();
        new Thread(consumerThread).start();
    }
}
