package com.pudge.test02;

public class MyException extends RuntimeException {
    static final long serialVersionUID = -703489745766939L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
