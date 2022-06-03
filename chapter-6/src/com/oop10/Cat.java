package com.oop10;

public class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("我是小猫，我可以喵喵叫");
        System.out.println("my age is" + age);
    }

    public void scratch() {
        System.out.println("挠人");
    }
}
