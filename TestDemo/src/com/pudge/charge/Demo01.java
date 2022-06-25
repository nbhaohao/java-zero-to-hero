package com.pudge.charge;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        StringBuilder details = new StringBuilder();
        int balance = 0;
        while (true) {
            System.out.println("welcome to use this system...");
            System.out.println("1. history");
            System.out.println("2. add benefit");
            System.out.println("3. add cost");
            System.out.println("4. exit");
            System.out.println("please choose:");
            Scanner scanner = new Scanner(System.in);
            int operator = scanner.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("----history----");
                    System.out.println(details.toString());
                    break;
                case 2:
                    System.out.println("----add benefit----");
                    System.out.println("----add benefit value----");
                    int money = scanner.nextInt();
                    System.out.println("----add benefit description----");
                    String benefitDescription = scanner.next();
                    balance += money;
                    details.append("benefit: ").append(money).append(", description: ").append(benefitDescription).append(", balance: ").append(balance).append("\n");
                    break;
                case 3:
                    System.out.println("----add cost----");
                    System.out.println("----add cost value----");
                    int cost = scanner.nextInt();
                    System.out.println("----add cost description----");
                    String costDescription = scanner.next();
                    balance -= cost;
                    details.append("cost: ").append(cost).append(", description: ").append(costDescription).append(", balance: ").append(balance).append("\n");
                    break;
                case 4:
                    System.out.println("----exit----");
                    return;
                default:
                    System.out.println("----wrong number----");
            }
        }

    }
}
