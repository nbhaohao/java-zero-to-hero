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
    static int age = 2;
    String name;

    class C {
    }

    static class B {
        public B() {
            // 静态内部类只能访问静态的东西
//            System.out.println(name);
            System.out.println(age);
        }
    }


    @Override
    public void a() {
        class A {
            {
                System.out.println("123");
            }
        }
    }

    public void c() {
        // call default method
        b();
        TestInterface03.super.b();
    }


}