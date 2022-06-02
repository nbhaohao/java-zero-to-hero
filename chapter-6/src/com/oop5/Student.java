package com.oop5;

public class Student extends Person {
    double score;

    public Student() {
    }

    public void study() {
        System.out.println("我可以学习");
    }

    public void a() {
        System.out.println(super.age);
        super.eat();
    }
}
