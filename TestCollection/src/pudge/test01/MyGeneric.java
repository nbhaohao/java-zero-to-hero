package pudge.test01;

public class MyGeneric<E> {
    int age;
    String name;
    E sex;

    public void a(E n) {

    }

    public void b(E[] m) {
    }
}

/* 定义泛型，或者之间指定 */
class SubGeneric extends MyGeneric<Integer> {
//class SubGeneric<E> extends MyGeneric<E> {
}

class Test33 {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.a("123");
        myGeneric.b(new String[]{"345"});
    }
}