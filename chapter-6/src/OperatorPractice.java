public class OperatorPractice {

    public static void printNumberPosition(int number) {
        System.out.println("num: " + number % 10);
        System.out.println("ten: " + number / 10 % 10);
        System.out.println("hundred: " + number / 100 % 10);
        System.out.println("thousand: " + number / 1000);
    }

    public static void trickyOne() {
        int a = 5;
        System.out.println(a++ + a++); // 11
        // a = 7
        System.out.println(a++ + ++a); // 16
        // a = 9
        System.out.println(++a + ++a); // 21
    }

    public static void main(String[] args) {
        printNumberPosition(1234);
        trickyOne();
        int a = 5;
        int d = 7;
        int b = a++;
        System.out.println("b:" + b);
        int c = ++d;
        System.out.println("c:" + c);

    }
}
