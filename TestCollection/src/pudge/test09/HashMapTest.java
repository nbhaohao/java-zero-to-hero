package pudge.test09;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, "lili");
        hashMap.put(7, "feifei");
        hashMap.put(19, "lulu");
        hashMap.put(13, "mingming");
        hashMap.put(13, "mingming-new");
        hashMap.put(6, "yingying");
        System.out.println(hashMap);
        System.out.println(hashMap.size());
    }
}
