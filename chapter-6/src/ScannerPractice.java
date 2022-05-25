import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入年龄：");
        int age = sc.nextInt();
        System.out.print("请录入身高：");
        double height = sc.nextDouble();
        System.out.print("请录入姓名：");
        String name = sc.next();
        System.out.print("请录入性别：");
        char general = sc.next().charAt(0);
    }
}
