package pudge.test07;

import java.util.Comparator;
import java.util.TreeSet;

class A {
    private int age;

    public A(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }
}


// 外部比较器
class CompareTest implements Comparator<A> {

    @Override
    public int compare(A o1, A o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

public class Test {
    public static void main(String[] args) {
        A a1 = new A(12);
        A a2 = new A(10);
        System.out.println(new CompareTest().compare(a1, a2));
        TreeSet<A> treeSet = new TreeSet<>(new CompareTest());
        treeSet.add(a1);
        treeSet.add(a2);
        System.out.println(treeSet);
    }
}
