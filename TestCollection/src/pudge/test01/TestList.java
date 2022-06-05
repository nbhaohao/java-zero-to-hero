package pudge.test01;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        System.out.println(list);
        list.add(3, 66);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
}
