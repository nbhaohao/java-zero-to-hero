package com.pudge.test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = scanner.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = scanner.nextInt();
            System.out.println("商：" + num1 / num2);
        } catch (InputMismatchException exception) {
            System.out.println("对不起，你录入的不是数字");
        } catch (ArithmeticException exception) {
            System.out.println("对不起，除数不能为0");
        } catch (Exception exception) {
            System.out.println("兜底");
        } finally {
            System.out.println("code after try...catch...");
        }
    }
}
