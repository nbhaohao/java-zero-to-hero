package pudge.test03;

public class MyLinkedList {
    Node first;
    Node last;

    int count = 0;

    public MyLinkedList() {
    }

    public void add(Object o) {
        Node n = new Node();
        if (first == null) {
            first = n;
            first.setPre(null);
            first.setObject(o);
            first.setNext(null);
        } else {
            n.setPre(last);
            n.setObject(o);
            n.setNext(null);
            last.setNext(n);
        }
        last = n;
        count++;
    }

    public int getSize() {
        return count;
    }

    public Object get(int index) {
        Node n = first;
        for (int i = 0; i < index; i++) {
            if (n != null) {
                n = n.getNext();
            }
        }
        if (n == null) {
            return null;
        }
        return n.getObject();
    }
}

class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("aa");
        myLinkedList.add("bb");
        myLinkedList.add("cc");
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.get(1));
    }
}