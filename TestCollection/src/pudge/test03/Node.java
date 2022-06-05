package pudge.test03;

public class Node {
    private Node pre;
    private Object object;
    private Node next;

    @Override
    public String toString() {
        return object.toString();
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
