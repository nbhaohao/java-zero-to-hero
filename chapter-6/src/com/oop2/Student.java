package com.oop2;

public class Student extends Person {
    private int number;
    int test;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void study() {
        System.out.println("学生可以学习");
    }
}
