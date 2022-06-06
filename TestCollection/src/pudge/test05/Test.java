package pudge.test05;

import java.util.HashSet;
import java.util.Objects;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.add(19);
        integerSet.add(5);
        integerSet.add(19);
        integerSet.add(41);
        System.out.println(integerSet.size());
        System.out.println(integerSet);
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("123");
        stringSet.add("123");
        stringSet.add("456");
        stringSet.add("4777");
        System.out.println(stringSet.size());
        System.out.println(stringSet);
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("zz", 13));
        studentHashSet.add(new Student("zz", 13));
        studentHashSet.add(new Student("x", 13));
        System.out.println(studentHashSet.size());
        System.out.println(studentHashSet);
    }
}
