package com.oop7;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为P40", 2035.98, 2020);
        Phone p2 = new Phone("华为P40", 2035.98, 2020);
        System.out.println(p1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        Cat c = new Cat();
        System.out.println(p1.equals(c));
    }
}
