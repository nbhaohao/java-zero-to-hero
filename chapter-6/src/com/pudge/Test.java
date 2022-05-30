package com.pudge;

public class Test {
    public static void main(String[] args) {
        /*
         * 第一次加载类的时候，会进行类的加载
         * 初始化创建对象的时候，对象的属性没有给赋值，有默认初始化的值
         *
         */
        Person person = new Person();
        person.name = "张三";
        person.age = 16;
        person.weight = 2;
        person.height = 3;

        /*
         * 再次创建类的时候，就不会进行类的加载了
         * */
        Person person1 = new Person();
        person1.name = "李四";
        person1.age = 18;
        person1.height = 3;
        person1.weight = 4;

        person.eat();
        person1.eat();

        person.sleep("教室");
        person.introduce();
    }
}
