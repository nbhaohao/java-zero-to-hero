package pudge.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(18);
        collection.add(12);
        collection.add(11);
        collection.add(17);
//        System.out.println(collection);
        collection.addAll(Arrays.asList(new Integer[]{11, 15, 3, 7, 1}));
//        System.out.println(collection);
//        collection.clear();
//        System.out.println(collection);
//        System.out.println(collection.size());
//        System.out.println(collection.isEmpty());
        for (Object value : collection
        ) {
            System.out.print(value + "\t");
        }
        System.out.println("\n");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            // 获取元素，并移动指针
            System.out.print(it.next() + "\t");
        }
    }
}
