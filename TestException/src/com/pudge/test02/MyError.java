package com.pudge.test02;

public class MyError extends Exception {
    public MyError() {
    }

    public MyError(String message) {
        super(message);
    }
}
