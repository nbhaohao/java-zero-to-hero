package com.pudge.reflect2;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1
        final Class<Person> personClass = Person.class;
        String someClassFullName = "com.pudge.reflect2.Person";
        // 2
        final Class<Person> personClass1 = Person.class;
        // 3
        final Class<?> aClass1 = Test.class.getClassLoader().loadClass(someClassFullName);
        // 4
        final Class<? extends Person> aClass = Class.forName(someClassFullName).asSubclass(Person.class);
        Person person = aClass.getConstructor().newInstance();
        System.out.println(person);
    }
}
