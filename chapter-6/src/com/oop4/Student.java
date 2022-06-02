package com.oop4;

public class Student extends Person {
    void study() {
        System.out.println("学习");
    }

    @Override
    protected void eat() {
        System.out.println("吃小龙虾，喝🍺");
    }
}
