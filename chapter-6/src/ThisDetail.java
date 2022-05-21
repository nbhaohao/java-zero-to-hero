public class ThisDetail {
    public static void main(String[] args) {
        ThisDetailResolver thisDetailResolver = new ThisDetailResolver();
        thisDetailResolver.f2();
    }
}

class ThisDetailResolver {
    public ThisDetailResolver() {
//        System.out.println("");
        /**
         * 使用 this 可以访问其他构造器
         * 但是调用必须是第一条语句
         */
        this("123");
        System.out.println("ThisDetailResolver() 构造器");
    }

    public ThisDetailResolver(String name) {
        System.out.println(name);
        System.out.println("ThisDetailResolver(String name) 构造器");
    }

    public void f1() {
        System.out.println("f1() 方法..");
    }

    public void f2() {
        System.out.println("f2() 方法..");
        f1();
        this.f1();
    }
}
