package com.pudge.test01;

public class Test6 {
    public static void main(String[] args) {
        divide();
        try {
            test2();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void divide() {
        throw new RuntimeException();
    }

    public static void test() {
        try {
            throw new Exception();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void test2() throws Exception {
        throw new Exception();
    }
}
