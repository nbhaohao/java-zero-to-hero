package pudge.test01;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(12);
        a1.add(34);
        for (Integer value : a1
        ) {
            System.out.println(value + "\t");
        }
    }
}
