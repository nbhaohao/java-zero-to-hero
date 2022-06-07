package pudge.test08;

import java.util.TreeSet;

class Noop {
}

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(12);
        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(11);
        treeSet.add(200);
        treeSet.add(5);
        System.out.println(treeSet);
        TreeSet<Noop> noopTreeSet = new TreeSet<>();
        noopTreeSet.add(new Noop());
        noopTreeSet.add(new Noop());
        noopTreeSet.add(new Noop());
        System.out.println(noopTreeSet);
    }
}
