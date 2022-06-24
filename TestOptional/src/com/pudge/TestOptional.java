package com.pudge;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        optional.orElseGet(s -> s + "");
        if (optional.isPresent()) {
            optional.get();
        } else {
            System.out.println("empty now" + optional.orElse("123"));
        }
    }
}
