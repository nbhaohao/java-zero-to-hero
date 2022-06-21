package com.pudge;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceDemo02 {
    public static void main(String[] args) {
        test(() -> 2);
        test2((value) -> System.out.println(value));
    }

    public static int test(Supplier<Integer> supplier) {
        return supplier.get();
    }

    /**
     * first andThen
     * consumer
     * (value) -> accept: {consumer.accept(value); sout(print + value)}
     * second andThen
     * (value) -> accept: {consumer.accept(value); sout(print + value);      sout(print twice + value);}
     *
     */
    public static void test2(Consumer<Integer> consumer) {
        // 2. add operator in here
        consumer.andThen((value) -> {
            System.out.println("print" + value);
        }).andThen(value -> {
            System.out.println("print twice" + value);
            // 1.we pass value here, run the first operator
        }).accept(4);
    }
}
