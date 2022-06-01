package com.pudge4;

public class Demo {
    int id;
    static int sid;

    public void a() {
        System.out.println(id);
        System.out.println(sid);
        System.out.println("-----a");
    }

    static public void b() {
//        System.out.println(id);
        System.out.println(sid);
        System.out.println("-----b");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.a();
        Demo.b();
        d.b();
    }
}
