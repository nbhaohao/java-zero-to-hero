package com.pudge.test02;

public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) throws Exception {
        this.name = name;
        this.age = age;
        this.setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws MyError {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
            throw new MyError("123");
        } else {
//            throw new RuntimeException("wrong sex value");
//            try {
//                throw new Exception("wrong sex value");
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
            throw new MyException("wrong sex value");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
