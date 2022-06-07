package pudge.test06;

class Student implements Comparable<Student> {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}

public class Test {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        System.out.println(a.compareTo(b));
        Student aStudent = new Student(17, "zzh");
        Student bStudent = new Student(16, "zzh");
        System.out.println(aStudent.compareTo(bStudent));
    }
}
