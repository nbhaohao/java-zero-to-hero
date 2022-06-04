package com.pudge.test01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = scanner.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = scanner.nextInt();
            System.out.println("商：" + num1 / num2);
        } catch (Exception exception) {
            System.out.println("对不起，你的程序出现异常了");
            System.out.println(exception);
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            throw exception;
        } finally {
            System.out.println("code after try...catch...");
        }
    }
}
