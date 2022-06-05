package pudge.test01;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    // 泛型方法
    public <T> void a(T e) {

    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<?> list1 = null;
        list1 = list;
        list1 = list2;
        list1 = list3;
    }
}
