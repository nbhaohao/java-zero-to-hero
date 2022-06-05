package pudge.test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();
        // <=
        List<? extends Person> list = null;
//        list = a;
//        list = b;
//        list = c;
        // >=
        List<? super Person> list1 = null;
        list1 = a;
        list1 = b;
//        list1 = c;
        List<Object> list2 = new LinkedList<>();
        list2.add("123");
        list2.add("456");
        list2.add("789");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + "\t");
        }
        System.out.println("----");
        for (Object object : list2) {
            System.out.print(object + "\t");
        }
        System.out.println("-----");
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}
