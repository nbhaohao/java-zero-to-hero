package com.pudge;

interface MyInterface {
    static void test2() {
        System.out.println("123");
    }
}

interface UserService {
    void show();
}

interface OrderService {
    int getOrderNum(int a);
}


public class LambdaDemo01 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("new thread" + Thread.currentThread().getName())).start();
        System.out.println("main thread" + Thread.currentThread().getName());
        new Thread(() -> System.out.println("new lambda thread"));
        goShow(() -> System.out.println("show"));
        goOrderService((a) -> 2 + a);
    }

    public static void goShow(UserService userService) {
        userService.show();
    }

    public static void goOrderService(OrderService orderService) {
        orderService.getOrderNum(2);
    }
}
