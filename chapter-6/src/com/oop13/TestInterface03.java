package com.oop13;

public interface TestInterface03 {
    public static final int NUM = 10;

    public abstract void a();

    public default void b() {
        System.out.println("default method");
    }

    // 静态方法
    public static void test() {
        System.out.println("xxx");
    }
}

class Test03 implements TestInterface03 {
    @Override
    public void a() {

    }

    public void c() {
        // call default method
        b();
        TestInterface03.super.b();
    }

}