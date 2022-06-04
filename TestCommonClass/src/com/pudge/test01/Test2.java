package com.pudge.test01;

public class Test2 {
    public static void main(String[] args) {
        // 自动装箱
        Integer i = 12;
        System.out.println(i);
        // 自动拆箱
        Integer i2 = new Integer(12);
        int num = i2;
        System.out.println(num);
    }
}
