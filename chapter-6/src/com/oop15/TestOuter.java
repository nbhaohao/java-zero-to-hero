package com.oop15;

public class TestOuter {
    int age;

    static {
        System.out.println("父类静态块");
    }

    public void a() {

    }

    public TestOuter() {
        System.out.println("父类构造器");
    }

    public TestOuter(int age) {
        this.age = age;
    }
}

class Child extends TestOuter {
    static {
        System.out.println("子类静态块");
    }

    public Child() {
        System.out.println("子类构造器");
    }
}

class Test {
    public static void main(String[] args) {
        new Child();
    }
}