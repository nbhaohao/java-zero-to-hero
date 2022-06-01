package com.pudge4;

public class Student {
    String name;
    int age;
    static String school;

    public static void main(String[] args) {
        Student.school = "xxxSchool";
        Student student = new Student();
        student.name = "张三";
        student.age = 19;

        Student student2 = new Student();
        student.name = "李四";
        student.age = 21;

        System.out.println(student2.school);
    }
}
