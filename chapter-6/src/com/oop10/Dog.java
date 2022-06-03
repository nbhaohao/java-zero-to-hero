package com.oop10;

public class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("小狗，汪汪叫");
    }

    public void guard() {
        System.out.println("看家");
    }
}
