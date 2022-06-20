package com.pudge.reflect2;

public class Student extends Person {
    private int id;
    double height;
    protected double weight;
    public double score;

    public String showInfo() {
        return "this is a student";
    }

    private void work() {
        System.out.println("will work soon");
    }

    public Student() {
        System.out.println("empty constructor");
    }

    private Student(int id) {
        this.id = id;
    }

    Student(int id, double score) {
        this(id);
        this.score = score;
    }
}
