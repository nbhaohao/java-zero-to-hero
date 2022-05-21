public class This {
    public static void main(String[] args) {
        Dog dog = new Dog("大壮", 3);
        dog.info();
        Dog dog2 = new Dog("大黄", 2);
        dog2.info();
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println(name + "\t" + age + "\t");
    }
}