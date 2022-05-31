package com.pudge2;

public class Person {
    String name;
    int age;
    double height;

    /*
     * 调用构造器是为了给对象属性赋值
     * 因为在进入构造器的时候，对象已经在内存中存在了
     * */
    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat() {
        System.out.println("我喜欢吃饭");
    }
}
