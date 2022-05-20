/**
 * 构造器的修饰符可以默认
 * 构造器没有返回值
 * 方法名和类名必须一样
 * 参数列表和成员方法的规则一致
 * 构造器的调用由系统完成
 */
public class Constructor {
    public static void main(String[] args) {
        ConstructorResolver constructorResolver = new ConstructorResolver(
                "zzh",
                18
        );
        ConstructorResolver constructorResolver1 = new ConstructorResolver(
                "zzh"
        );
        System.out.println("信息如下");
        System.out.println(constructorResolver.name);
        System.out.println(constructorResolver.age);
    }

}

/**
 * 如果没有定义构造器，系统会自动给类生成一个无参构造器
 * run `javap out.production.chapter-6.Constructor`
 */
class ConstructorResolver {
    String name;
    int age;

    public ConstructorResolver(String pName, int pAge) {
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }

    // constructor overload
    public ConstructorResolver(String pName) {
        name = pName;
    }
}