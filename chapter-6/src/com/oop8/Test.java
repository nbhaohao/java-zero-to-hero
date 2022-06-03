package com.oop8;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy(16, "xxx");
        Girl girl = new Girl("ccc", 2.2, new Mom());

        girl.work(boy);
        girl.talk();
    }
}
