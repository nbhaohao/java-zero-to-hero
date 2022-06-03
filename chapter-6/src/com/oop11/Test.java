package com.oop11;

public class Test {
    public static void main(String[] args) {
        final int a = 10;
        // a = 20;
        final Dog d = new Dog();
        // d = new Dog();
        // still could modify attribute value
        d.age = 2;
    }

    // could use final in params list
    public static void b(final Dog d) {
    }
}
