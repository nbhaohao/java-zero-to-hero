package pudge.test09;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(new MyComparator());
        map.put("flili", 1);
        map.put("clili", 2);
        map.put("dlili", 3);
        map.put("alili", 4);
        System.out.println(map);
    }
}
