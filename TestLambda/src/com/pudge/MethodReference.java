package com.pudge;

import java.util.function.Supplier;

class Test {
    int get() {
        return 2;
    }
}

public class MethodReference {
    public static int staticMethod() {
        return 2;
    }


    public static void main(String[] args) {
        Test test = new Test();
        // object::method
        testMethod(test::get);
        // class::staticMethod
        testMethod(MethodReference::staticMethod);
    }

    public static void testMethod(Supplier<Integer> supplier) {
        supplier.get();
    }
}
