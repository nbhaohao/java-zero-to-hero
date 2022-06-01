package com.pudge5;

public class Test {
    int a;
    static int sa;

    public void a() {
        System.out.println("-----a");
        // 代码块
        {
            // num 的作用域只在这个花括号中有效
            int num = 10;
            System.out.println(num);
        }
    }

    public static void b() {
        System.out.println("-----b");
    }

    // 构造块
    {
        System.out.println("-----pppp");
    }

    // 静态块，在类被加载时加载
    static {
        System.out.println("这是静态块");
        System.out.println(sa);
    }

    public Test() {
    }

    // 构造器
    public Test(int a) {
        this.a = a;
        Test t = new Test();
    }


    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a();
        Test t2 = new Test();
        t2.a();
    }
}
