package com.oop13;

//2. 1.8 之前，接口只有两部分内容：
//        a. 常量：public static final 固定修饰符
//        b. 抽象方法：public abstract 固定修饰符
public interface TestInterface01 {
    int NUM = 10;

    void a();

    void b(int num);
}

interface TestInterface02 {
    int NUM = 20;

    int a();

    void b(int num);
}

//class Test implements TestInterface01, TestInterface02 {
//
////     repeat name method
//    @Override
//    public int a() {
//        System.out.println(TestInterface01.NUM);
//        System.out.println(TestInterface02.NUM);
//        return 0;
//    }
//
//    @Override
//    public void b(int num) {
//
//    }
//}