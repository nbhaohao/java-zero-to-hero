package com.pudge.test01;

public class Test5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.pudge.test01.Test5").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
