package com.pudge;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceDemo01 {
    public static void main(String[] args) {
        test2(value -> true);
    }

    public static String test(Function<Integer, String> func) {
        return func.apply(2);
    }

    public static void test2(Predicate<Integer> predicate) {
        System.out.println(predicate.negate().test(2));
    }
}
