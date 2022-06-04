package com.pudge.test02;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ff");
        student.setAge(18);
        try {
            student.setSex("female");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(student);
        Student student1 = null;
        try {
            student1 = new Student("娜娜", 21, "asdasdasd ");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(student1);
    }
}
