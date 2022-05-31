package com.pudge2;

public class Test {
    public static void main(String[] args) {
        new Person();
        Person person = new Person("zzh", 12, 13);
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);
    }
}
