package com.pudge.test01;

import java.util.Scanner;

public class Test {
    // code would be hard to read
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入第一个数：");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            System.out.println("请录入第二个数：");
            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.out.println("对不起，除数不能为0");
                } else {
                    System.out.println("商：" + num1 / num2);
                }
            } else {
                System.out.println("你录入的不是 int 类型的数据");
            }
        } else {
            System.out.println("你录入的不是 int 类型的数据");
        }

    }
}
