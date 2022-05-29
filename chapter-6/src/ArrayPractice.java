import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[] scoreArray = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.print("请录入第" + i + "个学生的成绩：");
            int score = scanner.nextInt();
            scoreArray[i - 1] = score;
            sum += score;
        }
        System.out.println(Arrays.toString(scoreArray));
        System.out.println("十个学生的成绩之和为：" + sum);
        System.out.println("十个学生的平均数为：" + sum / 10);
    }
}
