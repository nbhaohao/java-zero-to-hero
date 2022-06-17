package com.pudge;

public class Person {
    /**
     * @param num1 some description
     * @param num2 some description2
     */
    @Deprecated
    public void eat(int num1, int num2) {
    }

    public void sleep() {
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int age = 10;
    }
}
