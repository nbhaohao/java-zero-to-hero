package pudge.test02;

import java.util.ArrayList;
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
    }
}
