public class Overload {
    public static void main(String[] args) {
        OverloadResolver overloadResolver = new OverloadResolver();
        overloadResolver.test(1);
        overloadResolver.test(1, 2);
    }
}

class OverloadResolver {

    /*
     * 重载，形参的类型，个数不一样
     *
     * */
    public void test(int i) {
        System.out.println(i);
    }

    public void test(int i, int j) {
        System.out.println(i);
        System.out.println(j);
    }
}
