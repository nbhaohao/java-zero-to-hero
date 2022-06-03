package com.oop12;

public abstract class Person {
    public void eat() {
        System.out.println("eat");
    }

    public void say() {
        System.out.println("say");
    }

    public abstract void customizeMethod();
}
