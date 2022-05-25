public class OperatorPractice {

    public static void printNumberPosition(int number) {
        System.out.println("num: " + number % 10);
        System.out.println("ten: " + number / 10 % 10);
        System.out.println("hundred: " + number / 100 % 10);
        System.out.println("thousand: " + number / 1000);
    }

    public static void main(String[] args) {
        printNumberPosition(1234);
    }
}
