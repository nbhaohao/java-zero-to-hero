class Cat {
    String name;
    int age;
    String color;

}

public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        System.out.println(cat1.name);
    }
}
