package com.oop16;

public class TestOuter {
    public void method() {
        int num = 10;
        final int age = 20;
        class A {
            public void test() {
                // 在局部内部类中访问到到变量必须是被 final 修饰的
//                num = 20;
                System.out.println(age);
            }
        }
    }
}
