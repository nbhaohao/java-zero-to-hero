public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
//        t1.test(4);
        System.out.println(t1.fibonacci(5));
        System.out.println(t1.fibonacci(7));
        System.out.println(t1.quiz(1));
    }
}

class T {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n=" + n);
    }

    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*
     * 猴子吃桃子：有一堆桃子，猴子第一天吃其中的一半，并且多吃一个
     * 每天都是这样，当到第 10 天时，想再吃的时候，发现只有 1 个桃子了，问：最初有几个桃子？
     *
     * day 10, 1
     * day 9 (day10 + 1) * 2
     * */
    public int quiz(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (quiz(day + 1) + 1) * 2;
        } else {
            return -1;
        }
    }
}
