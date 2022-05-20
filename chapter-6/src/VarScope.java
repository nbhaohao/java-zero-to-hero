public class VarScope {

}

class Cat2 {
    // 全局变量：也就是属性
    // 全局变量可以加修饰符，局部变量不可以加修饰符
    int age = 18;

    // 除了属性以外，其他的变量都可以看成是局部变量(仅存在于定义的作用域中)
    // 这个变量无法在成员方法中使用
    {
        int blockAge = 12;
    }

    public void say() {
        // 局部变量，存在于成员方法中
        int n = 10;
        String name = "jack";
        System.out.println("在 say 方法中使用 age=" + age);
    }

    public void eat() {
        System.out.println("在 eat 方法中使用 age=" + age);
    }
}