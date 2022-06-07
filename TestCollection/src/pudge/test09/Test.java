package pudge.test09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("name", 123);
        map.put("xx", 123);
        map.put("zzzz", 123);
        map.put("rrrr", 123);
        map.put("age", 444);
        map.put("age", 444);
        System.out.println(map.size());
        System.out.println(map);
        Set<String> stringSet = map.keySet();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        Map<String, Integer> a = new HashMap<>();
        Map<String, Integer> b = new HashMap<>();
        a.put("zz", 2);
        b.put("zz", 2);
        System.out.println(a.equals(b));
    }
}
