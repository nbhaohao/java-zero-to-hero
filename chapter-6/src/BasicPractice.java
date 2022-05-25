import java.util.Scanner;

public class BasicPractice {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径：");
        int r = scanner.nextInt();
        // 实现功能：求圆的周长和面积
        // 求周长： 
        double c = 2 * PI * r;
        System.out.println("周长为：" + c);
        // 求面积：
        double s = PI * r * r;
        System.out.println("面积为：" + s);
    }
}
